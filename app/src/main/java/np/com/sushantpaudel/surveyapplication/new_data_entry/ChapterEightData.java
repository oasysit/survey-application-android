package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterEight;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

public class ChapterEightData implements Serializable {
    private Context context;
    private Activity activity;

    ChapterEightData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner spinnerVocationalSkillTraining = activity.findViewById(R.id.spinnerVocationalSkillTraining);
        Spinner spinnerAccountInBank = activity.findViewById(R.id.spinnerAccountInBank);
        Spinner spinnerLoanInTheFamily = activity.findViewById(R.id.spinnerLoanInTheFamily);
        Spinner spinnerLoanFrom = activity.findViewById(R.id.spinnerLoanFrom);
        Spinner spinnerLoanFor = activity.findViewById(R.id.spinnerLoanFor);
        Spinner spinnerMembersInvolvedInPolitics = activity.findViewById(R.id.spinnerMembersInvolvedInPolitics);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerVocationalSkillTraining = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerVocationalSkillTraining.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVocationalSkillTraining.setAdapter(arrayAdapterSpinnerVocationalSkillTraining);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerAccountInBank = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerAccountInBank.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAccountInBank.setAdapter(arrayAdapterSpinnerAccountInBank);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerLoanInTheFamily = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerLoanInTheFamily.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoanInTheFamily.setAdapter(arrayAdapterSpinnerLoanInTheFamily);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerLoanFrom = ArrayAdapter.createFromResource(context,
                R.array.loan_from, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerLoanFrom.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoanFrom.setAdapter(arrayAdapterSpinnerLoanFrom);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerLoanFor = ArrayAdapter.createFromResource(context,
                R.array.loan_for, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerLoanFor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoanFor.setAdapter(arrayAdapterSpinnerLoanFor);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerMembersInvolvedInPolitics = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerMembersInvolvedInPolitics.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMembersInvolvedInPolitics.setAdapter(arrayAdapterSpinnerMembersInvolvedInPolitics);

    }

    ChapterEight getData() {
        ChapterEight data = new ChapterEight();
        Spinner spinnerVocationalSkillTraining = activity.findViewById(R.id.spinnerVocationalSkillTraining);
        Spinner spinnerAccountInBank = activity.findViewById(R.id.spinnerAccountInBank);
        Spinner spinnerLoanInTheFamily = activity.findViewById(R.id.spinnerLoanInTheFamily);
        Spinner spinnerLoanFrom = activity.findViewById(R.id.spinnerLoanFrom);
        Spinner spinnerLoanFor = activity.findViewById(R.id.spinnerLoanFor);
        Spinner spinnerMembersInvolvedInPolitics = activity.findViewById(R.id.spinnerMembersInvolvedInPolitics);
        CheckBox checkboxTechnicalTrainingMan = activity.findViewById(R.id.checkBoxTechnicalTrainingMan);
        CheckBox checkboxTechnicalTrainingWoman = activity.findViewById(R.id.checkBoxTechnicalTrainingWoman);
        CheckBox checkboxTailoringTrainingMan = activity.findViewById(R.id.checkBoxTailoringTrainingMan);
        CheckBox checkboxTailoringTrainingWoman = activity.findViewById(R.id.checkBoxTailoringTrainingWoman);
        CheckBox checkboxCarpentryTrainingMan = activity.findViewById(R.id.checkBoxCarpentryTrainingMan);
        CheckBox checkboxCarpentryTrainingWomen = activity.findViewById(R.id.checkBoxCarpentryTrainingWomen);
        CheckBox checkboxEngineeringTrainingMan = activity.findViewById(R.id.checkBoxEngineeringTrainingMan);
        CheckBox checkboxEngineeringTrainingWoman = activity.findViewById(R.id.checkBoxEngineeringTrainingWoman);
        CheckBox checkboxFoodProcessingTrainingMan = activity.findViewById(R.id.checkBoxFoodProcessingTrainingMan);
        CheckBox checkboxFoodProcessingTrainingWoman = activity.findViewById(R.id.checkBoxFoodProcessingTrainingWoman);
        CheckBox checkboxPublicHealthTrainingMan = activity.findViewById(R.id.checkBoxPublicHealthTrainingMan);
        CheckBox checkboxPublicHealthTrainingWoman = activity.findViewById(R.id.checkBoxPublicHealthTrainingWoman);
        CheckBox checkboxAnimalHealthTrainingMan = activity.findViewById(R.id.checkBoxAnimalHealthTrainingMan);
        CheckBox checkboxAnimalHealthTrainingWoman = activity.findViewById(R.id.checkBoxAnimalHealthTrainingWoman);
        CheckBox checkboxForestTrainingMan = activity.findViewById(R.id.checkBoxForestTrainingMan);
        CheckBox checkboxForestTrainingWoman = activity.findViewById(R.id.checkBoxForestTrainingWoman);
        CheckBox checkboxTourismTrainingMan = activity.findViewById(R.id.checkBoxTourismTrainingMan);
        CheckBox checkboxTourismTrainingWoman = activity.findViewById(R.id.checkBoxTourismTrainingWoman);
        CheckBox checkboxArtsTrainingMan = activity.findViewById(R.id.checkBoxArtsTrainingMan);
        CheckBox checkboxArtsTrainingWoman = activity.findViewById(R.id.checkBoxArtsTrainingWoman);
        CheckBox checkboxOtherTrainingMan = activity.findViewById(R.id.checkBoxOtherTrainingMan);
        CheckBox checkboxOtherTrainingWoman = activity.findViewById(R.id.checkBoxOtherTrainingWoman);
        EditText editTextAgricultureIncome = activity.findViewById(R.id.editTextAgricultureIncome);
        EditText editTextIndurstryIncome = activity.findViewById(R.id.editTextIndurstryIncome);
        EditText editTextSalaryIncome = activity.findViewById(R.id.editTextSalaryIncome);
        EditText editTextForeignIncome = activity.findViewById(R.id.editTextForeignIncome);
        EditText editTextLabourIncome = activity.findViewById(R.id.editTextLabourIncome);
        EditText editTextOtherIncome = activity.findViewById(R.id.editTextOtherIncome);
        EditText editTextFoodingExpenditure = activity.findViewById(R.id.editTextFoodingExpenditure);
        EditText editTextClothingExpenditure = activity.findViewById(R.id.editTextClothingExpenditure);
        EditText editTextEducationExpenditure = activity.findViewById(R.id.editTextEducationExpenditure);
        EditText editTextHealthExpenditure = activity.findViewById(R.id.editTextHealthExpenditure);
        EditText editTextFestivalsExpenditure = activity.findViewById(R.id.editTextFestivalsExpenditure);
        EditText editTextLabourExpenditure = activity.findViewById(R.id.editTextLabourExpenditure);
        EditText editTextOtherExpenditure = activity.findViewById(R.id.editTextOtherExpenditure);

        data.setVocationalSkillTraining(getText(spinnerVocationalSkillTraining));
        data.setAccountInBank(getText(spinnerAccountInBank));
        data.setLoanInTheFamily(getText(spinnerLoanInTheFamily));
        data.setLoanFrom(getText(spinnerLoanFrom));
        data.setLoanFor(getText(spinnerLoanFor));
        data.setMembersInvolvedInPolitics(getText(spinnerMembersInvolvedInPolitics));
        data.setInvolvedIn(getInvolvedIn());
        data.setTechnicalTrainingMan(getText(checkboxTechnicalTrainingMan).equals("Yes") ? "1" : "0");
        data.setTechnicalTrainingWoman(getText(checkboxTechnicalTrainingWoman).equals("Yes") ? "1" : "0");
        data.setTailoringTrainingMan(getText(checkboxTailoringTrainingMan).equals("Yes") ? "1" : "0");
        data.setTailoringTrainingWoman(getText(checkboxTailoringTrainingWoman).equals("Yes") ? "1" : "0");
        data.setCarpentryTrainingMan(getText(checkboxCarpentryTrainingMan).equals("Yes") ? "1" : "0");
        data.setCarpentryTrainingWomen(getText(checkboxCarpentryTrainingWomen).equals("Yes") ? "1" : "0");
        data.setEngineeringTrainingMan(getText(checkboxEngineeringTrainingMan).equals("Yes") ? "1" : "0");
        data.setEngineeringTrainingWoman(getText(checkboxEngineeringTrainingWoman).equals("Yes") ? "1" : "0");
        data.setFoodProcessingTrainingMan(getText(checkboxFoodProcessingTrainingMan).equals("Yes") ? "1" : "0");
        data.setFoodProcessingTrainingWoman(getText(checkboxFoodProcessingTrainingWoman).equals("Yes") ? "1" : "0");
        data.setPublicHealthTrainingMan(getText(checkboxPublicHealthTrainingMan).equals("Yes") ? "1" : "0");
        data.setPublicHealthTrainingWoman(getText(checkboxPublicHealthTrainingWoman).equals("Yes") ? "1" : "0");
        data.setAnimalHealthTrainingMan(getText(checkboxAnimalHealthTrainingMan).equals("Yes") ? "1" : "0");
        data.setAnimalHealthTrainingWoman(getText(checkboxAnimalHealthTrainingWoman).equals("Yes") ? "1" : "0");
        data.setForestTrainingMan(getText(checkboxForestTrainingMan).equals("Yes") ? "1" : "0");
        data.setForestTrainingWoman(getText(checkboxForestTrainingWoman).equals("Yes") ? "1" : "0");
        data.setTourismTrainingMan(getText(checkboxTourismTrainingMan).equals("Yes") ? "1" : "0");
        data.setTourismTrainingWoman(getText(checkboxTourismTrainingWoman).equals("Yes") ? "1" : "0");
        data.setArtsTrainingMan(getText(checkboxArtsTrainingMan).equals("Yes") ? "1" : "0");
        data.setArtsTrainingWoman(getText(checkboxArtsTrainingWoman).equals("Yes") ? "1" : "0");
        data.setOtherTrainingMan(getText(checkboxOtherTrainingMan).equals("Yes") ? "1" : "0");
        data.setOtherTrainingWoman(getText(checkboxOtherTrainingWoman).equals("Yes") ? "1" : "0");
        data.setAgricultureIncome(getText(editTextAgricultureIncome));
        data.setIndurstryIncome(getText(editTextIndurstryIncome));
        data.setSalaryIncome(getText(editTextSalaryIncome));
        data.setForeignIncome(getText(editTextForeignIncome));
        data.setLabourIncome(getText(editTextLabourIncome));
        data.setOtherIncome(getText(editTextOtherIncome));
        data.setFoodingExpenditure(getText(editTextFoodingExpenditure));
        data.setClothingExpenditure(getText(editTextClothingExpenditure));
        data.setEducationExpenditure(getText(editTextEducationExpenditure));
        data.setHealthExpenditure(getText(editTextHealthExpenditure));
        data.setFestivalsExpenditure(getText(editTextFestivalsExpenditure));
        data.setLabourExpenditure(getText(editTextLabourExpenditure));
        data.setOtherExpenditure(getText(editTextOtherExpenditure));

        return data;
    }

    private String getInvolvedIn() {
        String string = "";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInLocalLevel)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInLocalLevelPlan)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInLocalHealth)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInSchoolManagement)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInAgricultureGroup)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInForestConsumers)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInCooperative)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInSavingAndLoan)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInWomanGroup)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInDrinkingWater)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInIrrigationWater)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInIncomeGeneratingGroup)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInEthnicGroup)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInYouthChildGroup)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.involvedInOtherActivity)).equals("Yes") ? "1" : "0";
        return string;
    }
}
