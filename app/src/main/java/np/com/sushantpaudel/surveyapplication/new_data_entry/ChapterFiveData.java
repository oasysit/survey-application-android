package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterFive;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterFiveData implements Serializable {
    private Context context;
    private Activity activity;
    private ChapterFive data = new ChapterFive();

    ChapterFiveData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner typeOfTreatment = activity.findViewById(R.id.spinnerTypeOfTreatment);
        Spinner healthPostDistance = activity.findViewById(R.id.spinnerHealthPostDistance);
        Spinner hospitalDistance = activity.findViewById(R.id.spinnerHospitalDistance);
        Spinner womenDisease = activity.findViewById(R.id.spinnerWomenDisease);
        Spinner sufferingFrom = activity.findViewById(R.id.spinnerSufferingFrom);
        Spinner childrenInjection = activity.findViewById(R.id.spinnerChildrenInjection);
        Spinner bornHIVInfected = activity.findViewById(R.id.spinnerBornHivInfected);
        Spinner getARVProfilexesService = activity.findViewById(R.id.spinnerARVProfilexesService);
        Spinner usedPipedWater = activity.findViewById(R.id.spinnerUsedPipedWater);
        Spinner usedWell = activity.findViewById(R.id.spinnerUsedWell);
        Spinner usedSourceWater = activity.findViewById(R.id.spinnerUsedSourceWater);
        Spinner usedJarWater = activity.findViewById(R.id.spinnerUsedJarWater);
        Spinner usedOther = activity.findViewById(R.id.spinnerUsedOther);
        Spinner afterToiletWashHands = activity.findViewById(R.id.spinnerAfterToiletWashHands);
        Spinner beforeMealWashHands = activity.findViewById(R.id.spinnerBeforeMealWashHands);
        Spinner afterMealWashHands = activity.findViewById(R.id.spinnerAfterMealWashHands);
        Spinner beforeFeedingChildWashHands = activity.findViewById(R.id.spinnerBeforeFeedingChildWashHands);
        Spinner afterToiletingChildWashHands = activity.findViewById(R.id.spinnerAfterToiletingChildWashHands);
        Spinner familyHealthInsurance = activity.findViewById(R.id.spinnerFamilyHealthInsurance);

        ArrayAdapter<CharSequence> adapterTypeOfTreatment = ArrayAdapter.createFromResource(context,
                R.array.type_of_treatment, android.R.layout.simple_spinner_item);
        adapterTypeOfTreatment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeOfTreatment.setAdapter(adapterTypeOfTreatment);

        ArrayAdapter<CharSequence> adapterHealthPostDistance = ArrayAdapter.createFromResource(context,
                R.array.health_post_distance, android.R.layout.simple_spinner_item);
        adapterHealthPostDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        healthPostDistance.setAdapter(adapterHealthPostDistance);

        ArrayAdapter<CharSequence> adapterHospitalDistance = ArrayAdapter.createFromResource(context,
                R.array.hospital_distance, android.R.layout.simple_spinner_item);
        adapterHospitalDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hospitalDistance.setAdapter(adapterHospitalDistance);

        ArrayAdapter<CharSequence> adapterWomenDisease = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterWomenDisease.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        womenDisease.setAdapter(adapterWomenDisease);

        ArrayAdapter<CharSequence> adapterSufferingFrom = ArrayAdapter.createFromResource(context,
                R.array.suffering_from, android.R.layout.simple_spinner_item);
        adapterSufferingFrom.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sufferingFrom.setAdapter(adapterSufferingFrom);

        ArrayAdapter<CharSequence> adapterChildrenInjection = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterChildrenInjection.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        childrenInjection.setAdapter(adapterChildrenInjection);

        ArrayAdapter<CharSequence> adapterBornHIVInfected = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterBornHIVInfected.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bornHIVInfected.setAdapter(adapterBornHIVInfected);

        ArrayAdapter<CharSequence> adapterGetARVProfilexesService = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterGetARVProfilexesService.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getARVProfilexesService.setAdapter(adapterGetARVProfilexesService);

        ArrayAdapter<CharSequence> adapterUsedPipedWater = ArrayAdapter.createFromResource(context,
                R.array.used_water, android.R.layout.simple_spinner_item);
        adapterUsedPipedWater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usedPipedWater.setAdapter(adapterUsedPipedWater);

        ArrayAdapter<CharSequence> adapterUsedWell = ArrayAdapter.createFromResource(context,
                R.array.used_water, android.R.layout.simple_spinner_item);
        adapterUsedWell.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usedWell.setAdapter(adapterUsedWell);

        ArrayAdapter<CharSequence> adapterUsedSourceWater = ArrayAdapter.createFromResource(context,
                R.array.used_water, android.R.layout.simple_spinner_item);
        adapterUsedSourceWater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usedSourceWater.setAdapter(adapterUsedSourceWater);

        ArrayAdapter<CharSequence> adapterUsedJarWater = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterUsedJarWater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usedJarWater.setAdapter(adapterUsedJarWater);

        ArrayAdapter<CharSequence> adapterUsedOther = ArrayAdapter.createFromResource(context,
                R.array.used_water, android.R.layout.simple_spinner_item);
        adapterUsedOther.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usedOther.setAdapter(adapterUsedOther);

        ArrayAdapter<CharSequence> adapterAfterToiletWashHands = ArrayAdapter.createFromResource(context,
                R.array.wash_hands, android.R.layout.simple_spinner_item);
        adapterAfterToiletWashHands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        afterToiletWashHands.setAdapter(adapterAfterToiletWashHands);

        ArrayAdapter<CharSequence> adapterBeforeMealWashHands = ArrayAdapter.createFromResource(context,
                R.array.wash_hands, android.R.layout.simple_spinner_item);
        adapterBeforeMealWashHands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        beforeMealWashHands.setAdapter(adapterBeforeMealWashHands);

        ArrayAdapter<CharSequence> adapterAfterMealWashHands = ArrayAdapter.createFromResource(context,
                R.array.wash_hands, android.R.layout.simple_spinner_item);
        adapterAfterMealWashHands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        afterMealWashHands.setAdapter(adapterAfterMealWashHands);

        ArrayAdapter<CharSequence> adapterBeforeFeedingChildWashHands = ArrayAdapter.createFromResource(context,
                R.array.wash_hands, android.R.layout.simple_spinner_item);
        adapterBeforeFeedingChildWashHands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        beforeFeedingChildWashHands.setAdapter(adapterBeforeFeedingChildWashHands);

        ArrayAdapter<CharSequence> adapterAfterToiletingChildWashHands = ArrayAdapter.createFromResource(context,
                R.array.wash_hands, android.R.layout.simple_spinner_item);
        adapterAfterToiletingChildWashHands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        afterToiletingChildWashHands.setAdapter(adapterAfterToiletingChildWashHands);

        ArrayAdapter<CharSequence> adapterFamilyHealthInsurance = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterFamilyHealthInsurance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        familyHealthInsurance.setAdapter(adapterFamilyHealthInsurance);

    }

    private String[] getDiseaseData(View root) {
        EditText male = root.findViewById(R.id.editTextMale);
        EditText female = root.findViewById(R.id.editTextFemale);
        EditText other = root.findViewById(R.id.editTextOther);
        return new String[]{getText(male), getText(female), getText(other)};
    }

    private String[] getVaccineData(View root) {
        EditText boy = root.findViewById(R.id.editTextBoy);
        EditText girl = root.findViewById(R.id.editTextGirl);
        return new String[]{getText(boy), getText(girl)};
    }


    ChapterFive getData() {
        data.setTypeOfTreatment(getText((Spinner) activity.findViewById(R.id.spinnerTypeOfTreatment)));
        data.setHealthPostDistance(getText((Spinner) activity.findViewById(R.id.spinnerHealthPostDistance)));
        data.setHospitalDistance(getText((Spinner) activity.findViewById(R.id.spinnerHospitalDistance)));
        data.setWomenDis(getText((Spinner) activity.findViewById(R.id.spinnerWomenDisease)));
        data.setSufferingFrom(getText((Spinner) activity.findViewById(R.id.spinnerSufferingFrom)));
        data.setChildrenInjection(getText((Spinner) activity.findViewById(R.id.spinnerChildrenInjection)));
        data.setHiv(getDiseaseData(activity.findViewById(R.id.hiv)));
        data.setMalaria(getDiseaseData(activity.findViewById(R.id.malaria)));
        data.setTb(getDiseaseData(activity.findViewById(R.id.tb)));
        data.setCancer(getDiseaseData(activity.findViewById(R.id.cancer)));
        data.setSugar(getDiseaseData(activity.findViewById(R.id.sugar)));
        data.setHeart(getDiseaseData(activity.findViewById(R.id.heart)));
        data.setKidney(getDiseaseData(activity.findViewById(R.id.kidney)));
        data.setOthers(getDiseaseData(activity.findViewById(R.id.others)));
        data.setBcg(getVaccineData(activity.findViewById(R.id.bcg)));
        data.setDpt(getVaccineData(activity.findViewById(R.id.dpt)));
        data.setDpt2(getVaccineData(activity.findViewById(R.id.dpt2)));
        data.setDpt3(getVaccineData(activity.findViewById(R.id.dpt3)));
        data.setHIBPneumonia(getVaccineData(activity.findViewById(R.id.hibPneumonia)));
        data.setPCVPneumonia(getVaccineData(activity.findViewById(R.id.pcvPneumonia)));
        data.setMrDadura(getVaccineData(activity.findViewById(R.id.mrDadura)));
        data.setJapaneseEncephalitis(getVaccineData(activity.findViewById(R.id.japaneseEcephalitis)));
        data.setPoliyo(getVaccineData(activity.findViewById(R.id.poliyo)));
        data.setCholera(getVaccineData(activity.findViewById(R.id.cholera)));
        data.setHepatitis(getVaccineData(activity.findViewById(R.id.hepatitis)));
        data.setOtherInjection(getVaccineData(activity.findViewById(R.id.otherInjection)));
        data.setWormsMedicine(getVaccineData(activity.findViewById(R.id.wormsMedicine)));
        data.setVitaminA(getVaccineData(activity.findViewById(R.id.vitaminA)));
        data.setPregnantGetWormMedicine(getText((CheckBox) activity.findViewById(R.id.checkBoxWormMedicine)).equals("Yes") ? "1" : "0");
        data.setPregnantGetBabyTest(getText((CheckBox) activity.findViewById(R.id.checkBoxBabyTest)).equals("Yes") ? "1" : "0");
        data.setPregnantGetHealthCheckup(getText((CheckBox) activity.findViewById(R.id.checkBoxHealthCheckup)).equals("Yes") ? "1" : "0");
        data.setPregnantGetTitanus(getText((CheckBox) activity.findViewById(R.id.checkBoxTetanus)).equals("Yes") ? "1" : "0");
        data.setPregnantGetIron(getText((CheckBox) activity.findViewById(R.id.checkBoxIron)).equals("Yes") ? "1" : "0");
        data.setPregnantGetOtherTreatment(getText((CheckBox) activity.findViewById(R.id.checkBoxOtherTreatment)).equals("Yes") ? "1" : "0");
        data.setAgeOfDeliveryFirstChild(getText((EditText) activity.findViewById(R.id.editTextAgeOfDeliveryFirstChild)));
        data.setAgeOfDeliverySecondChild(getText((EditText) activity.findViewById(R.id.editTextAgeOfDeliverySecondChild)));
        data.setAgeOfDeliveryThirdChild(getText((EditText) activity.findViewById(R.id.editTextAgeOfDeliveryThirdChild)));
        data.setHealthCheckupTimesAfterPregnant(getText((EditText) activity.findViewById(R.id.editTextHealthCheckupTimesAfterPregnant)));
        data.setChildDeliveryPlace(getText((EditText) activity.findViewById(R.id.editTextChildDeliveryPlace)));
        data.setGettingVitaminA(getText((EditText) activity.findViewById(R.id.editTextGettingVitaminA)));
        data.setIronTabletNumber(getText((EditText) activity.findViewById(R.id.editTextIronTabletNumber)));
        data.setBreastFeedingDurationInMonths(getText((EditText) activity.findViewById(R.id.editTextBreastFeedingDuration)));
        data.setBornHIVInfected(getText((Spinner) activity.findViewById(R.id.spinnerBornHivInfected)));
        data.setGetARVProfilexesService(getText((Spinner) activity.findViewById(R.id.spinnerARVProfilexesService)));
        data.setUsedPipedWater(getText((Spinner) activity.findViewById(R.id.spinnerUsedPipedWater)));
        data.setUsedWell(getText((Spinner) activity.findViewById(R.id.spinnerUsedWell)));
        data.setUsedSourceWater(getText((Spinner) activity.findViewById(R.id.spinnerUsedSourceWater)));
        data.setUsedJarWater(getText((Spinner) activity.findViewById(R.id.spinnerUsedJarWater)).equals("Yes") ? "1" : "0");
        data.setUsedOther(getText((Spinner) activity.findViewById(R.id.spinnerUsedOther)));
        data.setAfterToiletWashHands(getText((Spinner) activity.findViewById(R.id.spinnerAfterToiletWashHands)));
        data.setBeforeMealWashHands(getText((Spinner) activity.findViewById(R.id.spinnerBeforeMealWashHands)));
        data.setAfterMealWashHands(getText((Spinner) activity.findViewById(R.id.spinnerAfterMealWashHands)));
        data.setBeforeFeedingChildWashHands(getText((Spinner) activity.findViewById(R.id.spinnerBeforeFeedingChildWashHands)));
        data.setAfterToiletingChildWashHands(getText((Spinner) activity.findViewById(R.id.spinnerAfterToiletingChildWashHands)));
        data.setFamilyHealthInsurance(getText((Spinner) activity.findViewById(R.id.spinnerFamilyHealthInsurance)));
        return data;
    }
}
