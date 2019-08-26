package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterTwo;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterTwoData implements Serializable {

    private Context context;
    private Activity activity;
    private ChapterTwo data = new ChapterTwo();

    ChapterTwoData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        if (context != null) {
            Spinner spinnerTypeOfSettlement = activity.findViewById(R.id.spinnerTypeOfSettlement);
            Spinner spinnerTypeOfOwner = activity.findViewById(R.id.spinnerTypeOfOwner);
            Spinner spinnerSeparateSleepKitchen = activity.findViewById(R.id.spinnerSeparateSleepKitchen);
            Spinner spinnerTypeOfResidence = activity.findViewById(R.id.spinnerTypeOfResidence);
            Spinner spinnerTypeOfHouse = activity.findViewById(R.id.spinnerTypeOfHouse);
            Spinner spinnerTypeOfFloor = activity.findViewById(R.id.spinnerTypeOfFloor);
            Spinner spinnerTypeOfWall = activity.findViewById(R.id.spinnerTypeOfWall);
            Spinner spinnerTypeOfRoof = activity.findViewById(R.id.spinnerTypeOfRoof);
            Spinner spinnerGovernmentStandard = activity.findViewById(R.id.spinnerGovernmentStandard);
            Spinner spinnerEarthquakeSafe = activity.findViewById(R.id.spinnerEarthquakeSafe);
            Spinner spinnerCarParking = activity.findViewById(R.id.spinnerCarParking);
            Spinner spinnerGreenary = activity.findViewById(R.id.spinnerGreenary);
            Spinner spinnerFlower = activity.findViewById(R.id.spinnerFlower);
            Spinner spinnerAreaOfTheHouse = activity.findViewById(R.id.spinnerAreaOfTheHouse);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfSettlement = ArrayAdapter.createFromResource(context,
                    R.array.type_of_settlement, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfSettlement.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfSettlement.setAdapter(arrayAdapterSpinnerTypeOfSettlement);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfOwner = ArrayAdapter.createFromResource(context,
                    R.array.type_of_owner, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfOwner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfOwner.setAdapter(arrayAdapterSpinnerTypeOfOwner);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerSeparateSleepKitchen = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerSeparateSleepKitchen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerSeparateSleepKitchen.setAdapter(arrayAdapterSpinnerSeparateSleepKitchen);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfResidence = ArrayAdapter.createFromResource(context,
                    R.array.type_of_residence, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfResidence.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfResidence.setAdapter(arrayAdapterSpinnerTypeOfResidence);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfHouse = ArrayAdapter.createFromResource(context,
                    R.array.type_of_house, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfHouse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfHouse.setAdapter(arrayAdapterSpinnerTypeOfHouse);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfFloor = ArrayAdapter.createFromResource(context,
                    R.array.type_of_floor, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfFloor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfFloor.setAdapter(arrayAdapterSpinnerTypeOfFloor);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfWall = ArrayAdapter.createFromResource(context,
                    R.array.type_of_wall, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfWall.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfWall.setAdapter(arrayAdapterSpinnerTypeOfWall);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerTypeOfRoof = ArrayAdapter.createFromResource(context,
                    R.array.type_of_roof, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerTypeOfRoof.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfRoof.setAdapter(arrayAdapterSpinnerTypeOfRoof);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerGovernmentStandard = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no_unknown, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerGovernmentStandard.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerGovernmentStandard.setAdapter(arrayAdapterSpinnerGovernmentStandard);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerEarthquakeSafe = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no_unknown, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerEarthquakeSafe.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerEarthquakeSafe.setAdapter(arrayAdapterSpinnerEarthquakeSafe);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerCarParking = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerCarParking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerCarParking.setAdapter(arrayAdapterSpinnerCarParking);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerGreenary = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerGreenary.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerGreenary.setAdapter(arrayAdapterSpinnerGreenary);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerFlower = ArrayAdapter.createFromResource(context,
                    R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerFlower.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerFlower.setAdapter(arrayAdapterSpinnerFlower);

            ArrayAdapter<CharSequence> arrayAdapterSpinnerAreaOfTheHouse = ArrayAdapter.createFromResource(context,
                    R.array.area_of_the_house_spinner, android.R.layout.simple_spinner_item);
            arrayAdapterSpinnerAreaOfTheHouse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerAreaOfTheHouse.setAdapter(arrayAdapterSpinnerAreaOfTheHouse);
        }
    }

    ChapterTwo getData() {
        EditText numberHH = activity.findViewById(R.id.editTextNumberHH);
        EditText numberHHStorey = activity.findViewById(R.id.editTextNumberHHStorey);
        EditText numberOfRooms = activity.findViewById(R.id.editTextNumberOfRooms);
        EditText familyUsedRoom = activity.findViewById(R.id.editTextFamilyUsedRooms);
        EditText areaOfTheHouse = activity.findViewById(R.id.editTextAreaOfTheHouse);
        EditText timeOfConstruction = activity.findViewById(R.id.editTextTimeOfConstruction);

        Spinner typeOfSettlement = activity.findViewById(R.id.spinnerTypeOfSettlement);
        Spinner typeOfOwner = activity.findViewById(R.id.spinnerTypeOfOwner);
        Spinner separateSleepKitchen = activity.findViewById(R.id.spinnerSeparateSleepKitchen);
        Spinner typeOfResidence = activity.findViewById(R.id.spinnerTypeOfResidence);
        Spinner typeOfHouse = activity.findViewById(R.id.spinnerTypeOfHouse);
        Spinner typeOfFloor = activity.findViewById(R.id.spinnerTypeOfFloor);
        Spinner typeOfWall = activity.findViewById(R.id.spinnerTypeOfWall);
        Spinner typeOfRoof = activity.findViewById(R.id.spinnerTypeOfRoof);
        Spinner governmentStandard = activity.findViewById(R.id.spinnerGovernmentStandard);
        Spinner earthquakeSafe = activity.findViewById(R.id.spinnerEarthquakeSafe);
        Spinner carParking = activity.findViewById(R.id.spinnerCarParking);
        Spinner greenary = activity.findViewById(R.id.spinnerGreenary);
        Spinner flower = activity.findViewById(R.id.spinnerFlower);
        Spinner areaOfTheHouseSpinner = activity.findViewById(R.id.spinnerAreaOfTheHouse);

        System.out.println(typeOfSettlement.getSelectedItem().toString());

        data.setTypeOfSettlement(getText(typeOfSettlement));
        data.setTypeOfOwner(getText(typeOfOwner));
        data.setSeparateSleepKitchen(getText(separateSleepKitchen));
        data.setTypeOfResidence(getText(typeOfResidence));
        data.setTypeOfHouse(getText(typeOfHouse));
        data.setTypeOfFloor(getText(typeOfFloor));
        data.setTypeOfWall(getText(typeOfWall));
        data.setTypeOfRoof(getText(typeOfRoof));
        data.setGovernmentStandard(getText(governmentStandard));
        data.setEarthquakeSafe(getText(earthquakeSafe));
        data.setCarParking(getText(carParking));
        data.setGreenary(getText(greenary));
        data.setFlower(getText(flower));

        data.setNumberHH(getText(numberHH));
        data.setNumberHHStorey(getText(numberHHStorey));
        data.setNumberOfRooms(getText(numberOfRooms));
        data.setFamilyUsedRoom(getText(familyUsedRoom));
        data.setTimeOfConstruction(getText(timeOfConstruction));

        data.setAreaOfTheHouse(getText(areaOfTheHouse) + getText(areaOfTheHouseSpinner));

        return data;

    }

}
