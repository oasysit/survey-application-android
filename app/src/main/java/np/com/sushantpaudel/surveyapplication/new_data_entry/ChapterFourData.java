package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterFour;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterFourData implements Serializable {
    private Context context;
    private Activity activity;
    ChapterFour data = new ChapterFour();

    ChapterFourData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner primaryDist = activity.findViewById(R.id.primaryDist);
        Spinner secondaryDist = activity.findViewById(R.id.secondaryDist);
        Spinner dropoutCause = activity.findViewById(R.id.dropOutCause);
        Spinner migrationType = activity.findViewById(R.id.migType);
        Spinner bornPlace = activity.findViewById(R.id.bornPlace);


        ArrayAdapter<CharSequence> primaryDistAdapter = ArrayAdapter.createFromResource(context,
                R.array.distance_in_time, android.R.layout.simple_spinner_item);
        primaryDistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primaryDist.setAdapter(primaryDistAdapter);

        ArrayAdapter<CharSequence> secondaryDistAdapter = ArrayAdapter.createFromResource(context,
                R.array.distance_in_time, android.R.layout.simple_spinner_item);
        secondaryDistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        secondaryDist.setAdapter(secondaryDistAdapter);

        ArrayAdapter<CharSequence> dropoutCauseAdapter = ArrayAdapter.createFromResource(context,
                R.array.dropout_cause, android.R.layout.simple_spinner_item);
        dropoutCauseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropoutCause.setAdapter(dropoutCauseAdapter);

        ArrayAdapter<CharSequence> migrationTypeAdapter = ArrayAdapter.createFromResource(context,
                R.array.migration_type, android.R.layout.simple_spinner_item);
        migrationTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        migrationType.setAdapter(migrationTypeAdapter);

        ArrayAdapter<CharSequence> bornPlaceAdapter = ArrayAdapter.createFromResource(context,
                R.array.born_place, android.R.layout.simple_spinner_item);
        bornPlaceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bornPlace.setAdapter(bornPlaceAdapter);

        final TextView totalCalculator = activity.findViewById(R.id.totalCalculator);
        final TextView totalBoy = activity.findViewById(R.id.totalPeopleBoy);
        final TextView totalGirl = activity.findViewById(R.id.totalPeopleGirl);
        totalCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalBoy.setText(String.format("Total boy : %s", getBoyGirlTotal()[0]));
                totalGirl.setText(String.format("Total girl : %s", getBoyGirlTotal()[1]));
            }
        });

    }

    private String[] getBoyGirlTotal() {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBelowOneYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenOneThreeYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenFourFiveYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenSixTenYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenElevenFifteenYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenSixteenEighteenYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenNineteenFortyFiveYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenFortySixSixtyYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenSixtyOneSixtyFiveYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenSixtySixSeventyYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageBetweenSeventyOneEightyYearOld)));
        list.add(getBoyGirlDataArray(activity.findViewById(R.id.ageAboveEightyYearOld)));
        int boy = 0;
        int girl = 0;
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> item = list.get(i);
            boy += Integer.parseInt(item.get(0));
            girl += Integer.parseInt(item.get(1));
        }
        return new String[]{String.valueOf(boy), String.valueOf(girl)};
    }

    private String getBoyGirlData(View root) {
        String girl = getText((EditText) root.findViewById(R.id.editTextGirl));
        String boy = getText((EditText) root.findViewById(R.id.editTextBoy));
        return girl + "," + boy;
    }

    private ArrayList<String> getBoyGirlDataArray(View root) {
        ArrayList<String> list = new ArrayList<>();
        String girl = getText((EditText) root.findViewById(R.id.editTextGirl));
        String boy = getText((EditText) root.findViewById(R.id.editTextBoy));
        list.add(boy);
        list.add(girl);
        return list;
    }

    private String getPensionData(View root) {
        String nepali = getText((EditText) root.findViewById(R.id.nepali));
        String indian = getText((EditText) root.findViewById(R.id.indian));
        String british = getText((EditText) root.findViewById(R.id.british));
        return nepali + "," + indian + "," + british;
    }

    ChapterFour getData() {
        data.setMaleNumber(getText((EditText) activity.findViewById(R.id.noOfPeopleGender).findViewById(R.id.editTextMale)));
        data.setFemaleNumber(getText((EditText) activity.findViewById(R.id.noOfPeopleGender).findViewById(R.id.editTextFemale)));
        data.setOthersNumber(getText((EditText) activity.findViewById(R.id.noOfPeopleGender).findViewById(R.id.editTextOther)));
        data.setAge_b1(getBoyGirlData(activity.findViewById(R.id.ageBelowOneYearOld)));
        data.setAge_1_3(getBoyGirlData(activity.findViewById(R.id.ageBetweenOneThreeYearOld)));
        data.setAge_4_5(getBoyGirlData(activity.findViewById(R.id.ageBetweenFourFiveYearOld)));
        data.setAge_6_10(getBoyGirlData(activity.findViewById(R.id.ageBetweenSixTenYearOld)));
        data.setAge_11_15(getBoyGirlData(activity.findViewById(R.id.ageBetweenElevenFifteenYearOld)));
        data.setAge_16_18(getBoyGirlData(activity.findViewById(R.id.ageBetweenSixteenEighteenYearOld)));
        data.setAge_19_45(getBoyGirlData(activity.findViewById(R.id.ageBetweenNineteenFortyFiveYearOld)));
        data.setAge_45_60(getBoyGirlData(activity.findViewById(R.id.ageBetweenFortySixSixtyYearOld)));
        data.setAge_60_65(getBoyGirlData(activity.findViewById(R.id.ageBetweenSixtyOneSixtyFiveYearOld)));
        data.setAge_65_70(getBoyGirlData(activity.findViewById(R.id.ageBetweenSixtySixSeventyYearOld)));
        data.setAge_70_80(getBoyGirlData(activity.findViewById(R.id.ageBetweenSeventyOneEightyYearOld)));
        data.setAge_80_plus(getBoyGirlData(activity.findViewById(R.id.ageAboveEightyYearOld)));
        // **OTHER START**
        String[] boyGirl = getBoyGirlTotal();
        data.setTotal(boyGirl[1] + "," + boyGirl[0]);
        // **OTHER END**
        data.setIll_5_15(getBoyGirlData(activity.findViewById(R.id.illiterateBetweenFiveFifteenYearOld)));
        data.setLit_5_15(getBoyGirlData(activity.findViewById(R.id.literateBetweenFiveFifteenYearOld)));
        data.setIll_16_45(getBoyGirlData(activity.findViewById(R.id.illiterateBetweenSixteenFourtyFiveYearOld)));
        data.setLit_16_45(getBoyGirlData(activity.findViewById(R.id.literateBetweenSixteenFourtyFiveYearOld)));
        data.setIll_46_60(getBoyGirlData(activity.findViewById(R.id.illiterateBetweenFourtySixSixtyYearOld)));
        data.setLit_46_60(getBoyGirlData(activity.findViewById(R.id.literateBetweenFourtySixSixtyYearOld)));
        data.setIll_60_plus(getBoyGirlData(activity.findViewById(R.id.illiterateAboveSixtyYearOld)));
        data.setLit_60_plus(getBoyGirlData(activity.findViewById(R.id.literateAboveSixtyYearOld)));
        data.setPreSchoolGovt(getBoyGirlData(activity.findViewById(R.id.preSchoolGovt)));
        data.setPreSchoolBoarding(getBoyGirlData(activity.findViewById(R.id.preSchoolBoarding)));
        data.setPrimaryGovt(getBoyGirlData(activity.findViewById(R.id.primaryGovernment)));
        data.setPrimaryBoarding(getBoyGirlData(activity.findViewById(R.id.primaryBoarding)));
        data.setSecGovt(getBoyGirlData(activity.findViewById(R.id.secondaryBoarding)));
        data.setSecBoarding(getBoyGirlData(activity.findViewById(R.id.secondaryBoarding)));
        data.setBachelors(getBoyGirlData(activity.findViewById(R.id.bachelors)));
        data.setMasters(getBoyGirlData(activity.findViewById(R.id.masters)));
        data.setmPhil(getBoyGirlData(activity.findViewById(R.id.mPhil)));
        data.setPhd(getBoyGirlData(activity.findViewById(R.id.phd)));
        // **OTHER START**
        data.setPrimaryDist(getText((Spinner) activity.findViewById(R.id.primaryDist)));
        data.setSecondaryDist(getText((Spinner) activity.findViewById(R.id.secondaryDist)));
        // **OTHER END**
        data.setNormalNotEnrollPrimary(getBoyGirlData(activity.findViewById(R.id.normalNotEnrollPrimary)));
        data.setAbormalNotEnrollPrimary(getBoyGirlData(activity.findViewById(R.id.abnormalNotEnrollPrimary)));
        data.setNormalNotEnrollSec(getBoyGirlData(activity.findViewById(R.id.normalNotEnrollSec)));
        data.setAbnormalNotEnrollSec(getBoyGirlData(activity.findViewById(R.id.abnormalNotEnrollSec)));
        data.setDropOut_5_18(getBoyGirlData(activity.findViewById(R.id.dropOut_5_18)));
        // **OTHER START**
        data.setDropoutCause(getText((Spinner) activity.findViewById(R.id.dropOutCause)));
        data.setChildInClub(getText((CheckBox) activity.findViewById(R.id.childInClub)));
        // **OTHER END**
        data.setSchoolClub(getBoyGirlData(activity.findViewById(R.id.schoolClub)));
        data.setToleClub(getBoyGirlData(activity.findViewById(R.id.toleClub)));
        data.setLabourClub(getBoyGirlData(activity.findViewById(R.id.labourClub)));
        data.setIntInSports(getBoyGirlData(activity.findViewById(R.id.intInSports)));
        data.setIntInArts(getBoyGirlData(activity.findViewById(R.id.intInArts)));
        data.setIntInLiterature(getBoyGirlData(activity.findViewById(R.id.intInLiterature)));
        data.setIntInCult(getBoyGirlData(activity.findViewById(R.id.intInCult)));
        data.setIntInTech(getBoyGirlData(activity.findViewById(R.id.intInTech)));
        data.setIntInTV(getBoyGirlData(activity.findViewById(R.id.intInTV)));
        data.setIntInInternet(getBoyGirlData(activity.findViewById(R.id.intInInternet)));
        data.setIntInNews(getBoyGirlData(activity.findViewById(R.id.intInNews)));
        data.setIntInSocialization(getBoyGirlData(activity.findViewById(R.id.intInSocialization)));
        data.setIntInStudy(getBoyGirlData(activity.findViewById(R.id.intInStudy)));
//        data.setSettleInRM(getBoyGirlData(activity.findViewById(R.id.settleInRM)));
//        data.setSettleOutRM(getBoyGirlData(activity.findViewById(R.id.settleOutRM)));
        data.setForeignIndia(getBoyGirlData(activity.findViewById(R.id.foreignIndia)));
        data.setForeignGulf(getBoyGirlData(activity.findViewById(R.id.foreignGulf)));
        data.setForeignKorea(getBoyGirlData(activity.findViewById(R.id.foreignKorea)));
        data.setForeignJapan(getBoyGirlData(activity.findViewById(R.id.foreignJapan)));
        data.setForeignMalaya(getBoyGirlData(activity.findViewById(R.id.foreignMalaya)));
        data.setForeignAust(getBoyGirlData(activity.findViewById(R.id.foreignAust)));
        data.setForeignEurope(getBoyGirlData(activity.findViewById(R.id.foreignEurope)));
        data.setForeignUS(getBoyGirlData(activity.findViewById(R.id.foreignUS)));
        data.setForeignOther(getBoyGirlData(activity.findViewById(R.id.foreignOther)));
        // **OTHER START**
        data.setForeignLess5Years(getText((EditText) activity.findViewById(R.id.foreignLess5Years)));
        data.setForeignMore5Years(getText((EditText) activity.findViewById(R.id.foreignMore5Years)));
        // **OTHER END**
        data.setcFourAgriculture(getBoyGirlData(activity.findViewById(R.id.cFourAgriculture)));
        data.setcFourIndustry(getBoyGirlData(activity.findViewById(R.id.cFourIndustry)));
        data.setcFourService(getBoyGirlData(activity.findViewById(R.id.cFourService)));
        // **OTHER START**
        data.setPension(getPensionData(activity.findViewById(R.id.pension)));
        // **OTHER END**
        data.setWages(getBoyGirlData(activity.findViewById(R.id.wages)));
        data.setForeignEmployment(getBoyGirlData(activity.findViewById(R.id.foreignEmployment)));
        data.setMentor(getBoyGirlData(activity.findViewById(R.id.mentor)));
        data.setStudent(getBoyGirlData(activity.findViewById(R.id.student)));
        data.setHouseWife(getBoyGirlData(activity.findViewById(R.id.houseWife)));
        data.setUnemployment(getBoyGirlData(activity.findViewById(R.id.unemployment)));
        data.setUnmarried(getBoyGirlData(activity.findViewById(R.id.unmarried)));
        data.setMarried(getBoyGirlData(activity.findViewById(R.id.married)));
        data.setPolygamy(getBoyGirlData(activity.findViewById(R.id.polygamy)));
        data.setReMarriage(getBoyGirlData(activity.findViewById(R.id.reMarriage)));
        data.setWidow(getBoyGirlData(activity.findViewById(R.id.widow)));
        data.setDivorce(getBoyGirlData(activity.findViewById(R.id.divorce)));
        data.setSeparate(getBoyGirlData(activity.findViewById(R.id.separate)));
        data.setNotDisabled(getBoyGirlData(activity.findViewById(R.id.notDisabled)));
        data.setPhysicallyDisabled(getBoyGirlData(activity.findViewById(R.id.physicallyDisabled)));
        data.setIntelDisabled(getBoyGirlData(activity.findViewById(R.id.intelDisabled)));
        data.setBlindDisabled(getBoyGirlData(activity.findViewById(R.id.blindDisabled)));
        data.setHearDisabled(getBoyGirlData(activity.findViewById(R.id.hearDisabled)));
        data.setMouthDisabled(getBoyGirlData(activity.findViewById(R.id.mouthDisabled)));
        data.setSpeechDisabled(getBoyGirlData(activity.findViewById(R.id.speechDisabled)));
        data.setBlindDeafDisabled(getBoyGirlData(activity.findViewById(R.id.blindDeafDisabled)));
        data.setMentalDisabled(getBoyGirlData(activity.findViewById(R.id.mentalDisabled)));
        // **OTHER START**
        data.setDisabilityCard(getText((CheckBox) activity.findViewById(R.id.disabilityCard)));
        data.setCardR(getText((EditText) activity.findViewById(R.id.cardR)));
        data.setCardB(getText((EditText) activity.findViewById(R.id.cardB)));
        data.setCardY(getText((EditText) activity.findViewById(R.id.cardY)));
        data.setCardW(getText((EditText) activity.findViewById(R.id.cardW)));
        data.setMigYN(getText((CheckBox) activity.findViewById(R.id.migYN)));
        data.setMigType(getText((Spinner) activity.findViewById(R.id.migType)));
        data.setMigYear(getText((EditText) activity.findViewById(R.id.migYear)));
        data.setMigCause(getText((EditText) activity.findViewById(R.id.migCause)));
        data.setChildBornThisyear(getText((CheckBox) activity.findViewById(R.id.childBornThisyear)));
        data.setChild_lt_1_m(getText((EditText) activity.findViewById(R.id.noOfChildBirth).findViewById(R.id.editTextBoy)));
        data.setChild_lt_1_f(getText((EditText) activity.findViewById(R.id.noOfChildBirth).findViewById(R.id.editTextGirl)));
        data.setBornPlace(getText((Spinner) activity.findViewById(R.id.bornPlace)));
        data.setChild_lt_1yr_death(getText((CheckBox) activity.findViewById(R.id.child_lt_1yr_death)));
        data.setChild_lt_1yr_girl(getText((EditText) activity.findViewById(R.id.childLtDeath1yr).findViewById(R.id.editTextGirl)));
        data.setChild_lt_1yr_boy(getText((EditText) activity.findViewById(R.id.childLtDeath1yr).findViewById(R.id.editTextBoy)));
        data.setCause_of_death(getText((EditText) activity.findViewById(R.id.causeOfDeath1yr)));
        data.setChild_lt_5yr_death(getText((CheckBox) activity.findViewById(R.id.child_lt_5yr_death)));
        data.setChild_lt_5yr_girl(getText((EditText) activity.findViewById(R.id.childLtDeath5yr).findViewById(R.id.editTextGirl)));
        data.setChild_lt_5yr_boy(getText((EditText) activity.findViewById(R.id.childLtDeath5yr).findViewById(R.id.editTextBoy)));
        data.setCauseOfDeath(getText((EditText) activity.findViewById(R.id.causeOfDeath5yr)));
        // **OTHER END**
        return data;
    }

}
