package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterNine;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterNineData implements Serializable {
    private Context context;
    private Activity activity;

    ChapterNineData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner spinnerNaturalDisasterHazards = activity.findViewById(R.id.spinnerNaturalDisasterHazards);
        Spinner spinnerFacingNaturalDisasterHazards = activity.findViewById(R.id.spinnerFacingNaturalDisasterHazards);
        Spinner spinnerMigratedNaturalDisaster = activity.findViewById(R.id.spinnerMigratedNaturalDisaster);
        Spinner spinnerFacingProblemAnimalAttack = activity.findViewById(R.id.spinnerFacingProblemAnimalAttack);
        Spinner spinnerFacingAbuse = activity.findViewById(R.id.spinnerFacingAbuse);
        Spinner spinnerSocialDiscrimination = activity.findViewById(R.id.spinnerSocialDiscrimination);
        Spinner spinnerEnviromentalProblems = activity.findViewById(R.id.spinnerEnviromentalProblems);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerEnviromentalProblems = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerEnviromentalProblems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEnviromentalProblems.setAdapter(arrayAdapterSpinnerEnviromentalProblems);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerSocialDiscrimination = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerSocialDiscrimination.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSocialDiscrimination.setAdapter(arrayAdapterSpinnerSocialDiscrimination);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFacingAbuse = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFacingAbuse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFacingAbuse.setAdapter(arrayAdapterSpinnerFacingAbuse);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFacingProblemAnimalAttack = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFacingProblemAnimalAttack.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFacingProblemAnimalAttack.setAdapter(arrayAdapterSpinnerFacingProblemAnimalAttack);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerMigratedNaturalDisaster = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerMigratedNaturalDisaster.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMigratedNaturalDisaster.setAdapter(arrayAdapterSpinnerMigratedNaturalDisaster);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFacingNaturalDisasterHazards = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFacingNaturalDisasterHazards.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFacingNaturalDisasterHazards.setAdapter(arrayAdapterSpinnerFacingNaturalDisasterHazards);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerNaturalDisasterHazards = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerNaturalDisasterHazards.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNaturalDisasterHazards.setAdapter(arrayAdapterSpinnerNaturalDisasterHazards);

    }

    ChapterNine getData() {
        ChapterNine data = new ChapterNine();

        Spinner spinnerNaturalDisasterHazards = activity.findViewById(R.id.spinnerNaturalDisasterHazards);
        Spinner spinnerFacingNaturalDisasterHazards = activity.findViewById(R.id.spinnerFacingNaturalDisasterHazards);
        Spinner spinnerMigratedNaturalDisaster = activity.findViewById(R.id.spinnerMigratedNaturalDisaster);
        Spinner spinnerFacingProblemAnimalAttack = activity.findViewById(R.id.spinnerFacingProblemAnimalAttack);
        Spinner spinnerFacingAbuse = activity.findViewById(R.id.spinnerFacingAbuse);
        Spinner spinnerSocialDiscrimination = activity.findViewById(R.id.spinnerSocialDiscrimination);
        Spinner spinnerEnviromentalProblems = activity.findViewById(R.id.spinnerEnviromentalProblems);

        CheckBox checkboxNaturalDisasterDrought = activity.findViewById(R.id.checkBoxNaturalDisasterDrought);
        CheckBox checkboxNaturalDisasterSettlementFiring = activity.findViewById(R.id.checkBoxNaturalDisasterSettlementFiring);
        CheckBox checkboxNaturalDisasterForestFiring = activity.findViewById(R.id.checkBoxNaturalDisasterForestFiring);
        CheckBox checkboxNaturalDisasterFlood = activity.findViewById(R.id.checkBoxNaturalDisasterFlood);
        CheckBox checkboxNaturalDisasterStorms = activity.findViewById(R.id.checkBoxNaturalDisasterStorms);
        CheckBox checkboxNaturalDisasterLighting = activity.findViewById(R.id.checkBoxNaturalDisasterLighting);
        CheckBox checkboxNaturalDisasterHailstone = activity.findViewById(R.id.checkBoxNaturalDisasterHailstone);
        CheckBox checkboxNaturalDisasterSubmergedLand = activity.findViewById(R.id.checkBoxNaturalDisasterSubmergedLand);
        CheckBox checkboxNaturalDisasterHeavyRain = activity.findViewById(R.id.checkBoxNaturalDisasterHeavyRain);
        CheckBox checkboxNaturalDisasterPartlyRain = activity.findViewById(R.id.checkBoxNaturalDisasterPartlyRain);
        CheckBox checkboxNaturalDisasterLandslide = activity.findViewById(R.id.checkBoxNaturalDisasterLandslide);
        CheckBox checkboxNaturalDisasterPesticides = activity.findViewById(R.id.checkBoxNaturalDisasterPesticides);
        CheckBox checkboxFacingDisasterDeath = activity.findViewById(R.id.checkBoxFacingDisasterDeath);
        CheckBox checkboxFacingDisasterWounded = activity.findViewById(R.id.checkBoxFacingDisasterWounded);
        CheckBox checkboxFacingDisasterLandLoss = activity.findViewById(R.id.checkBoxFacingDisasterLandLoss);
        CheckBox checkboxFacingDisasterAnimalDeaths = activity.findViewById(R.id.checkBoxFacingDisasterAnimalDeaths);
        CheckBox checkboxFacingDisasterAnimalWounded = activity.findViewById(R.id.checkBoxFacingDisasterAnimalWounded);
        CheckBox checkboxFacingDisasterCropLoss = activity.findViewById(R.id.checkBoxFacingDisasterCropLoss);
        CheckBox checkboxFacingDisasterOthers = activity.findViewById(R.id.checkBoxFacingDisasterOthers);
        CheckBox checkboxFacingAnimalAttackDeath = activity.findViewById(R.id.checkBoxFacingAnimalAttackDeath);
        CheckBox checkboxFacingAnimalAttackWounded = activity.findViewById(R.id.checkBoxFacingAnimalAttackWounded);
        CheckBox checkboxFacingAnimalAttackDamageHome = activity.findViewById(R.id.checkBoxFacingAnimalAttackDamageHome);
        CheckBox checkboxFacingAnimalAttackAnimalDeaths = activity.findViewById(R.id.checkBoxFacingAnimalAttackAnimalDeaths);
        CheckBox checkboxFacingAnimalAttackAnimalWounded = activity.findViewById(R.id.checkBoxFacingAnimalAttackAnimalWounded);
        CheckBox checkboxFacingAnimalAttackCropLoss = activity.findViewById(R.id.checkBoxFacingAnimalAttackCropLoss);
        CheckBox checkboxFacingAnimalAttackOthers = activity.findViewById(R.id.checkBoxFacingAnimalAttackOthers);
        CheckBox checkboxFacingAbuseMurder = activity.findViewById(R.id.checkBoxFacingAbuseMurder);
        CheckBox checkboxFacingAbuseRaping = activity.findViewById(R.id.checkBoxFacingAbuseRaping);
        CheckBox checkboxFacingAbuseKidnapped = activity.findViewById(R.id.checkBoxFacingAbuseKidnapped);
        CheckBox checkboxFacingAbuseFear = activity.findViewById(R.id.checkBoxFacingAbuseFear);
        CheckBox checkboxFacingAbuseRobbery = activity.findViewById(R.id.checkBoxFacingAbuseRobbery);
        CheckBox checkboxFacingAbuseDakaiti = activity.findViewById(R.id.checkBoxFacingAbuseDakaiti);
        CheckBox checkboxFacingAbuseGirlTrafficking = activity.findViewById(R.id.checkBoxFacingAbuseGirlTrafficking);
        CheckBox checkboxFacingAbuseHumanLoss = activity.findViewById(R.id.checkBoxFacingAbuseHumanLoss);
        CheckBox checkboxFacingAbuseOthers = activity.findViewById(R.id.checkBoxFacingAbuseOthers);
        CheckBox checkboxSocialDiscriminationEthnic = activity.findViewById(R.id.checkBoxSocialDiscriminationEthnic);
        CheckBox checkboxSocialDiscriminationGender = activity.findViewById(R.id.checkBoxSocialDiscriminationGender);
        CheckBox checkboxSocialDiscriminationWomen = activity.findViewById(R.id.checkBoxSocialDiscriminationWomen);
        CheckBox checkboxSocialDiscriminationLowCaste = activity.findViewById(R.id.checkBoxSocialDiscriminationLowCaste);
        CheckBox checkboxSocialDiscriminationCommunity = activity.findViewById(R.id.checkBoxSocialDiscriminationCommunity);
        CheckBox checkboxEnviromentalProblemsPollutedWater = activity.findViewById(R.id.checkBoxEnviromentalProblemsPollutedWater);
        CheckBox checkboxEnviromentalProblemsSolidWaste = activity.findViewById(R.id.checkBoxEnviromentalProblemsSolidWaste);
        CheckBox checkboxEnviromentalProblemsDrainage = activity.findViewById(R.id.checkBoxEnviromentalProblemsDrainage);
        CheckBox checkboxEnviromentalProblemsDust = activity.findViewById(R.id.checkBoxEnviromentalProblemsDust);
        CheckBox checkboxEnviromentalProblemsSoundPollution = activity.findViewById(R.id.checkBoxEnviromentalProblemsSoundPollution);
        CheckBox checkboxEnviromentalProblemsParking = activity.findViewById(R.id.checkBoxEnviromentalProblemsParking);
        CheckBox checkboxEnviromentalProblemsOverCrowded = activity.findViewById(R.id.checkBoxEnviromentalProblemsOverCrowded);

        data.setNaturalDisasterHazards(getText(spinnerNaturalDisasterHazards));
        data.setNaturalDisasterDrought(getText(checkboxNaturalDisasterDrought).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterSettlementFiring(getText(checkboxNaturalDisasterSettlementFiring).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterForestFiring(getText(checkboxNaturalDisasterForestFiring).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterFlood(getText(checkboxNaturalDisasterFlood).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterStorms(getText(checkboxNaturalDisasterStorms).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterLighting(getText(checkboxNaturalDisasterLighting).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterHailstone(getText(checkboxNaturalDisasterHailstone).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterSubmergedLand(getText(checkboxNaturalDisasterSubmergedLand).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterHeavyRain(getText(checkboxNaturalDisasterHeavyRain).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterPartlyRain(getText(checkboxNaturalDisasterPartlyRain).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterLandslide(getText(checkboxNaturalDisasterLandslide).equals("Yes") ? "1" : "0");
        data.setNaturalDisasterPesticides(getText(checkboxNaturalDisasterPesticides).equals("Yes") ? "1" : "0");
        data.setFacingNaturalDisasterHazards(getText(spinnerFacingNaturalDisasterHazards));
        data.setFacingDisasterDeath(getText(checkboxFacingDisasterDeath).equals("Yes") ? "1" : "0");
        data.setFacingDisasterWounded(getText(checkboxFacingDisasterWounded).equals("Yes") ? "1" : "0");
        data.setFacingDisasterLandLoss(getText(checkboxFacingDisasterLandLoss).equals("Yes") ? "1" : "0");
        data.setFacingDisasterAnimalDeaths(getText(checkboxFacingDisasterAnimalDeaths).equals("Yes") ? "1" : "0");
        data.setFacingDisasterAnimalWounded(getText(checkboxFacingDisasterAnimalWounded).equals("Yes") ? "1" : "0");
        data.setFacingDisasterCropLoss(getText(checkboxFacingDisasterCropLoss).equals("Yes") ? "1" : "0");
        data.setFacingDisasterOthers(getText(checkboxFacingDisasterOthers).equals("Yes") ? "1" : "0");
        data.setMigratedNaturalDisaster(getText(spinnerMigratedNaturalDisaster));
        data.setFacingProblemAnimalAttack(getText(spinnerFacingProblemAnimalAttack));
        data.setFacingAnimalAttackDeath(getText(checkboxFacingAnimalAttackDeath).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackWounded(getText(checkboxFacingAnimalAttackWounded).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackDamageHome(getText(checkboxFacingAnimalAttackDamageHome).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackAnimalDeaths(getText(checkboxFacingAnimalAttackAnimalDeaths).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackAnimalWounded(getText(checkboxFacingAnimalAttackAnimalWounded).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackCropLoss(getText(checkboxFacingAnimalAttackCropLoss).equals("Yes") ? "1" : "0");
        data.setFacingAnimalAttackOthers(getText(checkboxFacingAnimalAttackOthers).equals("Yes") ? "1" : "0");
        data.setFacingAbuse(getText(spinnerFacingAbuse));
        data.setFacingAbuseMurder(getText(checkboxFacingAbuseMurder).equals("Yes") ? "1" : "0");
        data.setFacingAbuseRaping(getText(checkboxFacingAbuseRaping).equals("Yes") ? "1" : "0");
        data.setFacingAbuseKidnapped(getText(checkboxFacingAbuseKidnapped).equals("Yes") ? "1" : "0");
        data.setFacingAbuseFear(getText(checkboxFacingAbuseFear).equals("Yes") ? "1" : "0");
        data.setFacingAbuseRobbery(getText(checkboxFacingAbuseRobbery).equals("Yes") ? "1" : "0");
        data.setFacingAbuseDakaiti(getText(checkboxFacingAbuseDakaiti).equals("Yes") ? "1" : "0");
        data.setFacingAbuseGirlTrafficking(getText(checkboxFacingAbuseGirlTrafficking).equals("Yes") ? "1" : "0");
        data.setFacingAbuseHumanLoss(getText(checkboxFacingAbuseHumanLoss).equals("Yes") ? "1" : "0");
        data.setFacingAbuseOthers(getText(checkboxFacingAbuseOthers).equals("Yes") ? "1" : "0");
        data.setSocialDiscrimination(getText(spinnerSocialDiscrimination));
        data.setSocialDiscriminationEthnic(getText(checkboxSocialDiscriminationEthnic).equals("Yes") ? "1" : "0");
        data.setSocialDiscriminationGender(getText(checkboxSocialDiscriminationGender).equals("Yes") ? "1" : "0");
        data.setSocialDiscriminationWomen(getText(checkboxSocialDiscriminationWomen).equals("Yes") ? "1" : "0");
        data.setSocialDiscriminationLowCaste(getText(checkboxSocialDiscriminationLowCaste).equals("Yes") ? "1" : "0");
        data.setSocialDiscriminationCommunity(getText(checkboxSocialDiscriminationCommunity).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblems(getText(spinnerEnviromentalProblems));
        data.setEnviromentalProblemsPollutedWater(getText(checkboxEnviromentalProblemsPollutedWater).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsSolidWaste(getText(checkboxEnviromentalProblemsSolidWaste).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsDrainage(getText(checkboxEnviromentalProblemsDrainage).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsDust(getText(checkboxEnviromentalProblemsDust).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsSoundPollution(getText(checkboxEnviromentalProblemsSoundPollution).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsParking(getText(checkboxEnviromentalProblemsParking).equals("Yes") ? "1" : "0");
        data.setEnviromentalProblemsOverCrowded(getText(checkboxEnviromentalProblemsOverCrowded).equals("Yes") ? "1" : "0");

        return data;
    }
}
