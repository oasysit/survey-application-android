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
import np.com.sushantpaudel.surveyapplication.model.ChapterSeven;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

class ChapterSevenData implements Serializable {
    private Context context;
    private Activity activity;

    ChapterSevenData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner spinnerLandUsedForAgriculture = activity.findViewById(R.id.spinnerLandUsedForAgriculture);
        Spinner spinnerRearingAnimal = activity.findViewById(R.id.spinnerRearingAnimal);
        Spinner spinnerFishery = activity.findViewById(R.id.spinnerFishery);
        Spinner spinnerBeeKeeping = activity.findViewById(R.id.spinnerBeeKeeping);
        Spinner spinnerHorticulture = activity.findViewById(R.id.spinnerHorticulture);
        Spinner spinnerAgricultureProductionSuffFor = activity.findViewById(R.id.spinnerAgricultureProductionSuffFor);
        Spinner spinnerFirm = activity.findViewById(R.id.spinnerFirm);
        Spinner spinnerFirmRegistered = activity.findViewById(R.id.spinnerFirmRegistered);
        Spinner spinnerFirmRegisteredIn = activity.findViewById(R.id.spinnerFirmRegisteredIn);
        Spinner spinnerFirmPanNumber = activity.findViewById(R.id.spinnerFirmPanNumber);
        Spinner spinnerFirmAuditReporting = activity.findViewById(R.id.spinnerFirmAuditReporting);
        Spinner spinnerPayingTaxToMunicipality = activity.findViewById(R.id.spinnerPayingTaxToMunicipality);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerLandUsedForAgriculture = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerLandUsedForAgriculture.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLandUsedForAgriculture.setAdapter(arrayAdapterSpinnerLandUsedForAgriculture);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerRearingAnimal = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerRearingAnimal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRearingAnimal.setAdapter(arrayAdapterSpinnerRearingAnimal);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFishery = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFishery.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFishery.setAdapter(arrayAdapterSpinnerFishery);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerBeeKeeping = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerBeeKeeping.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBeeKeeping.setAdapter(arrayAdapterSpinnerBeeKeeping);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerHorticulture = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerHorticulture.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHorticulture.setAdapter(arrayAdapterSpinnerHorticulture);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerAgricultureProductionSuffFor = ArrayAdapter.createFromResource(context,
                R.array.agriculture_production_suff, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerAgricultureProductionSuffFor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAgricultureProductionSuffFor.setAdapter(arrayAdapterSpinnerAgricultureProductionSuffFor);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFirm = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFirm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirm.setAdapter(arrayAdapterSpinnerFirm);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFirmRegistered = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFirmRegistered.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirmRegistered.setAdapter(arrayAdapterSpinnerFirmRegistered);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFirmRegisteredIn = ArrayAdapter.createFromResource(context,
                R.array.firm_registered_in, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFirmRegisteredIn.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirmRegisteredIn.setAdapter(arrayAdapterSpinnerFirmRegisteredIn);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFirmPanNumber = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFirmPanNumber.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirmPanNumber.setAdapter(arrayAdapterSpinnerFirmPanNumber);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerFirmAuditReporting = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerFirmAuditReporting.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFirmAuditReporting.setAdapter(arrayAdapterSpinnerFirmAuditReporting);

        ArrayAdapter<CharSequence> arrayAdapterSpinnerPayingTaxToMunicipality = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        arrayAdapterSpinnerPayingTaxToMunicipality.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPayingTaxToMunicipality.setAdapter(arrayAdapterSpinnerPayingTaxToMunicipality);
    }

    private String[] getCow(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String milk = getText((EditText) root.findViewById(R.id.editTextMilkProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        return new String[]{number, milk, other, annualIncome};
    }

    private String[] getBuffalo(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String milk = getText((EditText) root.findViewById(R.id.editTextMilkProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        String meatProduction = getText((EditText) root.findViewById(R.id.editTextMeatProduction));
        String boneSkin = getText((EditText) root.findViewById(R.id.editTextBoneSkin));
        return new String[]{number, milk, other, annualIncome, meatProduction, boneSkin};
    }

    private String[] getSheep(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String wool = getText((EditText) root.findViewById(R.id.editTextWoolProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        String meatProduction = getText((EditText) root.findViewById(R.id.editTextMeatProduction));
        String boneSkin = getText((EditText) root.findViewById(R.id.editTextBoneSkin));
        return new String[]{number, wool, other, annualIncome, meatProduction, boneSkin};
    }

    private String[] getPig(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String meat = getText((EditText) root.findViewById(R.id.editTextMeatProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        return new String[]{number, meat, other, annualIncome};
    }

    private String[] getHen(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String meat = getText((EditText) root.findViewById(R.id.editTextMeatProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        String egg = getText((EditText) root.findViewById(R.id.editTextEggProduction));
        return new String[]{number, meat, other, annualIncome, egg};
    }

    private String[] getPigeon(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String meat = getText((EditText) root.findViewById(R.id.editTextMeatProduction));
        String other = getText((EditText) root.findViewById(R.id.editTextOtherProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        String egg = getText((EditText) root.findViewById(R.id.editTextEggProduction));
        return new String[]{number, meat, other, annualIncome, egg};
    }

    private String[] getFish(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String area = getText((EditText) root.findViewById(R.id.editTextArea));
        String annualProduction = getText((EditText) root.findViewById(R.id.editTextAnnualProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        return new String[]{number, area, annualProduction, annualIncome};
    }

    private String[] getBee(View root) {
        String number = getText((EditText) root.findViewById(R.id.editTextNumber));
        String annualProduction = getText((EditText) root.findViewById(R.id.editTextAnnualProduction));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        return new String[]{number, annualProduction, annualIncome};
    }

    private String[] getHorticulture(View root) {
        String area = getText((EditText) root.findViewById(R.id.editTextArea));
        String annualIncome = getText((EditText) root.findViewById(R.id.editTextAnnualIncome));
        return new String[]{area, annualIncome};
    }

    private String[] getDataLand(View root) {
        String ropani = getText((EditText) root.findViewById(R.id.editTextRopani));
        String aana = getText((EditText) root.findViewById(R.id.editTextAana));
        String paisa = getText((EditText) root.findViewById(R.id.editTextPaisa));
        String daam = getText((EditText) root.findViewById(R.id.editTextDam));
        return new String[]{ropani, aana, paisa, daam};
    }

    private String[] getDataFood(View root) {
        String quantity = getText((EditText) root.findViewById(R.id.editTextQuantity));
        String area = getText((EditText) root.findViewById(R.id.editTextArea));
        String sell = getText((EditText) root.findViewById(R.id.editTextSell));
        return new String[]{quantity, area, sell};
    }

    private String getFirmTypes() {
        String string = "";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxGrocery)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxMeat)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxFruits)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxDairy)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxConstruction)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxPharmacy)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxWorkshop)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxElectrical)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxHotel)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxAgriculture)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxClothing)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxTourism)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxIndustry)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxPrivateEd)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxOtherInst)).equals("Yes") ? "1," : "0,";
        string += getText((CheckBox) activity.findViewById(R.id.checkboxOtherBusiness)).equals("Yes") ? "1" : "0";
        return string;
    }

    ChapterSeven getData() {
        ChapterSeven data = new ChapterSeven();
        data.setLandUsedForAgriculture(getText((Spinner) activity.findViewById(R.id.spinnerLandUsedForAgriculture)));
        data.setFamilyOwnershipOfLand(getDataLand(activity.findViewById(R.id.familyOwnershipLand)));
        data.setOwnershipOfLandBesidesFamily(getDataLand(activity.findViewById(R.id.ownershipOfLandBesidesFamily)));
        data.setOtherOwnershipOfLand(getDataLand(activity.findViewById(R.id.otherOwnershipLand)));
        data.setRice(getDataFood(activity.findViewById(R.id.rice)));
        data.setMaize(getDataFood(activity.findViewById(R.id.maize)));
        data.setWheat(getDataFood(activity.findViewById(R.id.wheat)));
        data.setMillet(getDataFood(activity.findViewById(R.id.millet)));
        data.setOtherCrops(getDataFood(activity.findViewById(R.id.otherCrops)));
        data.setBlackGram(getDataFood(activity.findViewById(R.id.blackGram)));
        data.setRahar(getDataFood(activity.findViewById(R.id.rahar)));
        data.setRedLentil(getDataFood(activity.findViewById(R.id.redLentil)));
        data.setGram(getDataFood(activity.findViewById(R.id.gram)));
        data.setBean(getDataFood(activity.findViewById(R.id.bean)));
        data.setSoyabean(getDataFood(activity.findViewById(R.id.soyabean)));
        data.setOtherBeans(getDataFood(activity.findViewById(R.id.otherBeans)));
        data.setMustard(getDataFood(activity.findViewById(R.id.mustard)));
        data.setSesame(getDataFood(activity.findViewById(R.id.sesame)));
        data.setSunflower(getDataFood(activity.findViewById(R.id.sunflower)));
        data.setOtherOil(getDataFood(activity.findViewById(R.id.otherOil)));
        data.setPotato(getDataFood(activity.findViewById(R.id.potato)));
        data.setCabbage(getDataFood(activity.findViewById(R.id.cabbage)));
        data.setPea(getDataFood(activity.findViewById(R.id.pea)));
        data.setTomato(getDataFood(activity.findViewById(R.id.tomato)));
        data.setCucumber(getDataFood(activity.findViewById(R.id.cucumber)));
        data.setMushroom(getDataFood(activity.findViewById(R.id.mushroom)));
        data.setBitterGaurd(getDataFood(activity.findViewById(R.id.bitterGaurd)));
        data.setOtherVegetable(getDataFood(activity.findViewById(R.id.otherVegetable)));
        data.setGinger(getDataFood(activity.findViewById(R.id.ginger)));
        data.setOnion(getDataFood(activity.findViewById(R.id.onion)));
        data.setChilli(getDataFood(activity.findViewById(R.id.chilli)));
        data.setMango(getDataFood(activity.findViewById(R.id.mango)));
        data.setLitchi(getDataFood(activity.findViewById(R.id.litchi)));
        data.setBanana(getDataFood(activity.findViewById(R.id.banana)));
        data.setPapaya(getDataFood(activity.findViewById(R.id.papaya)));
        data.setOrange(getDataFood(activity.findViewById(R.id.orange)));
        data.setPeach(getDataFood(activity.findViewById(R.id.peach)));
        data.setJackfood(getDataFood(activity.findViewById(R.id.jackfood)));
        data.setPineapple(getDataFood(activity.findViewById(R.id.pineapple)));
        data.setGuava(getDataFood(activity.findViewById(R.id.guava)));
        data.setKiwi(getDataFood(activity.findViewById(R.id.kiwi)));
        data.setCoffee(getDataFood(activity.findViewById(R.id.coffee)));
        data.setCardamom(getDataFood(activity.findViewById(R.id.cardamom)));
        data.setSugarcane(getDataFood(activity.findViewById(R.id.sugarcane)));
        data.setLandUsedForAgriculture(getText((Spinner) activity.findViewById(R.id.spinnerLandUsedForAgriculture)));
        data.setRearingAnimal(getText((Spinner) activity.findViewById(R.id.spinnerRearingAnimal)));
        data.setCow(getCow(activity.findViewById(R.id.cow)));
        data.setBuffalo(getBuffalo(activity.findViewById(R.id.buffalo)));
        data.setSheep(getSheep(activity.findViewById(R.id.sheep)));
        data.setPig(getPig(activity.findViewById(R.id.pig)));
        data.setHen(getHen(activity.findViewById(R.id.hen)));
        data.setPigeon(getPigeon(activity.findViewById(R.id.pigeon)));
        data.setFishery(getText((Spinner) activity.findViewById(R.id.spinnerFishery)));
        data.setBeeKeeping(getText((Spinner) activity.findViewById(R.id.spinnerBeeKeeping)));
        data.setHorticulture(getText((Spinner) activity.findViewById(R.id.spinnerHorticulture)));
        data.setFisheryContent(getFish(activity.findViewById(R.id.fishery)));
        data.setBeeContent(getFish(activity.findViewById(R.id.bee)));
        data.setHorticultureContent(getFish(activity.findViewById(R.id.horticulture)));
        data.setAgricultureProductionSuffFor(getText((Spinner) activity.findViewById(R.id.spinnerAgricultureProductionSuffFor)));
        data.setFirm(getText((Spinner) activity.findViewById(R.id.spinnerFirm)));
        data.setFirmTotalNumber(getText((EditText) activity.findViewById(R.id.editTextFirmTotalNumber)));
        data.setFirmRegistered(getText((Spinner) activity.findViewById(R.id.spinnerFirmRegistered)));
        data.setFirmRegisteredYesNumber(getText((EditText) activity.findViewById(R.id.editTextFirmRegisteredYes)));
        data.setFirmRegisteredNoNumber(getText((EditText) activity.findViewById(R.id.editTextFirmRegisteredNo)));
        data.setFirmRegisteredIn(getText((Spinner) activity.findViewById(R.id.spinnerFirmRegisteredIn)));
        data.setFirmPanNumber(getText((Spinner) activity.findViewById(R.id.spinnerFirmPanNumber)));
        data.setFirmTypes(getFirmTypes());
        data.setFirmInvestedAmount(getText((EditText) activity.findViewById(R.id.editTextFirmInvestmentAmount)));
        data.setFirmManInvolvement(getText((EditText) activity.findViewById(R.id.editTextFirmManInvolvement)));
        data.setFirmWomanInvolvement(getText((EditText) activity.findViewById(R.id.editTextFirmWomanInvolvement)));
        data.setFirmAnnualIncome(getText((EditText) activity.findViewById(R.id.editTextFirmAnnualIncome)));
        data.setFirmAuditReporting(getText((Spinner) activity.findViewById(R.id.spinnerFirmAuditReporting)));
        data.setPayingTaxToMunicipality(getText((Spinner) activity.findViewById(R.id.spinnerPayingTaxToMunicipality)));
        data.setPropertyTaxToMunicipality(getText((CheckBox) activity.findViewById(R.id.checkBoxPropertyTax)).equals("Yes") ? "1" : "0");
        data.setHomeTaxToMunicipality(getText((CheckBox) activity.findViewById(R.id.checkBoxHomeTax)).equals("Yes") ? "1" : "0");
        data.setBusinessTaxToMunicipality(getText((CheckBox) activity.findViewById(R.id.checkBoxBusinessTax)).equals("Yes") ? "1" : "0");
        data.setOtherTaxToMunicipality(getText((CheckBox) activity.findViewById(R.id.checkBoxOtherTax)).equals("Yes") ? "1" : "0");
        return data;
    }

}
