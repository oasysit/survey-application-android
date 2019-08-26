package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.active_android.DataModel;
import np.com.sushantpaudel.surveyapplication.model.Data;

import static np.com.sushantpaudel.surveyapplication.util.UtilClass.setLocale;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.showToast;

public class DataEntryActivity extends AppCompatActivity {
    private String previousFormNo = "";
    private final String TAG = "TESTING OUTPUT";
    private final Context context = this;
    private String email = "";
    private Data data = new Data();
    private boolean isExpanded = false;
    private ChapterOneData chapterOne = new ChapterOneData(context);
    private ChapterTwoData chapterTwo = new ChapterTwoData(context);
    private ChapterThreeData chapterThree = new ChapterThreeData(context);
    private ChapterFourData chapterFour = new ChapterFourData(context);
    private ChapterFiveData chapterFive = new ChapterFiveData(context);
    private ChapterSixData chapterSix = new ChapterSixData(context);
    private ChapterSevenData chapterSeven = new ChapterSevenData(context);
    private ChapterEightData chapterEight = new ChapterEightData(context);
    private ChapterNineData chapterNine = new ChapterNineData(context);
    private LocationManager locationManager;
    private LocationListener listener;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLocale(context);
        loadLayout();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void loadLayout() {
        setContentView(R.layout.activity_data_entry);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                loadLocationListener();
                loadData();
                toggleLayout();
            }
        });
    }

    private void loadLocationListener() {
        locationManager = (LocationManager) context.getSystemService(LOCATION_SERVICE);
        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                setLocation(location);
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        try {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2 * 60 * 1000, 0, listener);
            setLocation(locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setLocation(Location location) {
        try {
            String latLng = location.getLatitude() + "|" + location.getLongitude();
            data.setPresentLocation(latLng);
            System.err.println("\nLOCATION: " + latLng);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.err.println("\nLOCATION: " + location);
        }
    }

    void toggleVisibility(View view) {
        if (view.getVisibility() == View.GONE) {
            isExpanded = true;
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    private void toggleLayout() {
        TextView one = findViewById(R.id.btnChapterOne);
        TextView two = findViewById(R.id.btnChapterTwo);
        TextView three = findViewById(R.id.btnChapterThree);
        TextView four = findViewById(R.id.btnChapterFour);
        TextView five = findViewById(R.id.btnChapterFive);
        TextView six = findViewById(R.id.btnChapterSix);
        TextView seven = findViewById(R.id.btnChapterSeven);
        TextView nine = findViewById(R.id.btnChapterNine);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_one));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_two));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_three));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_four));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_five));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_six));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MERGING OF CHAPTER SEVEN AND CHAPTER EIGHT
                toggleVisibility(findViewById(R.id.chapter_seven));
                toggleVisibility(findViewById(R.id.chapter_eight));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(findViewById(R.id.chapter_nine));
            }
        });
    }

    private void showProgressDialog(String message) {
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    private void loadData() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        email = preferences.getString("email", null);
        if (email == null) {
            showToast(context, "Try logging again!");
            finish();
        }
        chapterOne.loadDropdownLists(); //Loading Spinner data for section one
        chapterTwo.loadDropdownLists(); //Loading Spinner data for section two
        chapterThree.loadDropdownLists(); //Loading Spinner data for section three
        chapterFour.loadDropdownLists(); //Loading Spinner data for section four
        chapterFive.loadDropdownLists(); //Loading Spinner data for section five
        chapterSix.loadDropdownLists(); //Loading Spinner data for section six
        chapterSeven.loadDropdownLists(); //Loading Spinner data for section seven
        chapterEight.loadDropdownLists(); //Loading Spinner data for section eight
        chapterNine.loadDropdownLists(); //Loading Spinner data for section nine
        completeDataEntry();
    }

    private boolean differentFormNo() {
        String currentFormNo = Util.getText((EditText) findViewById(R.id.editTextFormNo));
        return !currentFormNo.equals(previousFormNo);
    }

    private void completeDataEntry() {
        Button btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(context)
                        .setTitle("Do you want to enter the data?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        data.setChapterOne(chapterOne.getData());
                                        data.setChapterTwo(chapterTwo.getData());
                                        data.setChapterThree(chapterThree.getData());
                                        data.setChapterFour(chapterFour.getData());
                                        data.setChapterFive(chapterFive.getData());
                                        data.setChapterSix(chapterSix.getData());
                                        data.setChapterSeven(chapterSeven.getData());
                                        data.setChapterEight(chapterEight.getData());
                                        data.setChapterNine(chapterNine.getData());
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                if (differentFormNo()) {
                                                    saveDataToDatabase();
                                                    previousFormNo = Util.getText((EditText) findViewById(R.id.editTextFormNo));
                                                } else {
                                                    showToast(context, "This value is already entered!");
                                                }
                                            }
                                        });
                                    }
                                }).start();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
            }
        });
    }

    private void getCurrentLocation() {
        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            System.out.println(locationManager);
            if (locationManager != null) {
                locationManager.requestLocationUpdates("gps", 5000, 0, listener);
            }
        } else {
            showToast(context, "Enable location permission!");
            finish();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void saveDataToDatabase() {
        data.setUserEmail(email);
        String json = data.getJSON();
        DataModel dataModel = new DataModel();
        System.out.println("JSON -> " + json);
        System.out.println("JSON Length -> " + json.length());
        dataModel.json = json;
        dataModel.save();
        showToast(context, "Data is saved, successfully!");
    }

    @Override
    public void onBackPressed() {
        if (isExpanded) {
            toggleAllLayout();
            isExpanded = false;
        } else {
            if (differentFormNo()) {
                new AlertDialog.Builder(context)
                        .setTitle("Do you want to cancel the form?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                DataEntryActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        })
                        .show();
            } else {
                DataEntryActivity.super.onBackPressed();
            }
        }
    }

    private void toggleAllLayout() {
        findViewById(R.id.chapter_one).setVisibility(View.GONE);
        findViewById(R.id.chapter_two).setVisibility(View.GONE);
        findViewById(R.id.chapter_three).setVisibility(View.GONE);
        findViewById(R.id.chapter_four).setVisibility(View.GONE);
        findViewById(R.id.chapter_five).setVisibility(View.GONE);
        findViewById(R.id.chapter_six).setVisibility(View.GONE);
        findViewById(R.id.chapter_seven).setVisibility(View.GONE);
        findViewById(R.id.chapter_eight).setVisibility(View.GONE);
        findViewById(R.id.chapter_nine).setVisibility(View.GONE);
    }

}
