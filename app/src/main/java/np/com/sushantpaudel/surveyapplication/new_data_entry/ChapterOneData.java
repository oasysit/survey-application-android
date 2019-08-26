package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterOne;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterOneData {
    private Context context;
    private Activity activity;
    private ChapterOne data = new ChapterOne();

    ChapterOneData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        if (context != null) {
            Spinner spinnerCaste = activity.findViewById(R.id.spinnerCaste);
            Spinner spinnerSex = activity.findViewById(R.id.spinnerSex);
            Spinner spinnerReligion = activity.findViewById(R.id.spinnerReligion);
            Spinner spinnerTypeOfFamily = activity.findViewById(R.id.spinnerTypeOfFamily);
            Spinner spinnerMotherTongue = activity.findViewById(R.id.spinnerMotherTongue);

            ArrayAdapter<CharSequence> adapterCaste = ArrayAdapter.createFromResource(context,
                    R.array.caste, android.R.layout.simple_spinner_item);
            adapterCaste.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerCaste.setAdapter(adapterCaste);

            ArrayAdapter<CharSequence> adapterSex = ArrayAdapter.createFromResource(context,
                    R.array.sex, android.R.layout.simple_spinner_item);
            adapterSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerSex.setAdapter(adapterSex);

            ArrayAdapter<CharSequence> adapterReligion = ArrayAdapter.createFromResource(context,
                    R.array.religion, android.R.layout.simple_spinner_item);
            adapterReligion.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerReligion.setAdapter(adapterReligion);

            ArrayAdapter<CharSequence> adapterSettlement = ArrayAdapter.createFromResource(context,
                    R.array.type_of_family, android.R.layout.simple_spinner_item);
            adapterSettlement.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerTypeOfFamily.setAdapter(adapterSettlement);

            ArrayAdapter<CharSequence> adapterMotherTongue = ArrayAdapter.createFromResource(context,
                    R.array.mother_tongue, android.R.layout.simple_spinner_item);
            adapterMotherTongue.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerMotherTongue.setAdapter(adapterMotherTongue);

        }
    }

    ChapterOne getData() {
        EditText formNumber = activity.findViewById(R.id.editTextFormNo);
        EditText houseNumber = activity.findViewById(R.id.editTextHouseNumber);
        EditText wardNumber = activity.findViewById(R.id.editTextWardNumber);
        EditText presentSettlement = activity.findViewById(R.id.editTextPresentSettlement);
        EditText familyNumber = activity.findViewById(R.id.editTextFamilyNumber);
        EditText houseHeadName = activity.findViewById(R.id.editTextHouseHeadName);
        EditText contactNumber = activity.findViewById(R.id.editTextPhoneNumber);
        EditText roadName = activity.findViewById(R.id.editTextRoadName);
        EditText municipalityHHSno = activity.findViewById(R.id.editTextMunicipalityHHNo);
        CheckBox otherCaste = activity.findViewById(R.id.checkBoxOtherCaste);
//        EditText otherCasteEthnicity = activity.findViewById(R.id.editTextOtherCasteEthnicity);
        EditText otherReligion = activity.findViewById(R.id.editTextOtherReligion);
        EditText otherMotherTongue = activity.findViewById(R.id.editTextOtherMotherTongue);


        Spinner spinnerCaste = activity.findViewById(R.id.spinnerCaste);
        Spinner spinnerSex = activity.findViewById(R.id.spinnerSex);
        Spinner spinnerReligion = activity.findViewById(R.id.spinnerReligion);
        Spinner spinnerTypeOfFamily = activity.findViewById(R.id.spinnerTypeOfFamily);
        Spinner spinnerMotherTongue = activity.findViewById(R.id.spinnerMotherTongue);


        data.setHouseNo(getText(houseNumber));
        data.setWardNo(getText(wardNumber));
        data.setPresentSettlement(getText(presentSettlement));
        data.setFamilyNo(getText(familyNumber));
        data.setHouseholdHeadName(getText(houseHeadName));
        data.setRoadName(getText(roadName));
        data.setMunicipalityHHNo(getText(municipalityHHSno));
        data.setFormNo(getText(formNumber));
        data.setOtherCaste(getText(otherCaste).equals("Yes") ? "1" : "0");
//        data.setOtherCasteEthnicity(getText(otherCasteEthnicity));
        data.casteEthnicity(getCasteEthnicity(getText(spinnerCaste)));
        data.setOtherMotherTongue(getText(otherMotherTongue));
        data.setOtherReligion(getText(otherReligion));
        // Spinner
        data.setCaste(getText(spinnerCaste));
        data.setSex(getText(spinnerSex));
        data.setReligion(getText(spinnerReligion));
        data.setMotherTongue(getText(spinnerMotherTongue));
        data.setTypeOfFamily(getText(spinnerTypeOfFamily));
        data.setContactNo(getText(contactNumber));
//        addFamilyCount();

        return data;

    }

    private String getCasteEthnicity(String caste) {
        String[] mainCaste = {"Brahmin", "Chhetri", "Thakuri", "Giri", "Puri"};
        String[] adibasiJanajati = {"Gurung", "Magar", "Tamang", "Bhujel", "Newar", "Thakali"};
        String[] dalit = {"Kami", "Damai", "Sarki"};
        String ethnicity = "Other...";
        for (String s : mainCaste) {
            if (s.equals(caste)) {
                ethnicity = "Caste";
            }
        }
        for (String s : adibasiJanajati) {
            if (s.equals(caste)) {
                ethnicity = "Adhibasi Janajati";
            }
        }
        for (String s : dalit) {
            if (s.equals(caste)) {
                ethnicity = "Dalit";
            }
        }
        return ethnicity;
    }

}
