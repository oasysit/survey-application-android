package np.com.sushantpaudel.surveyapplication.model;

public class ChapterFive {

    /*
     *
     *         _                       _                      __   _
     *        | |                     | |                    / _| (_)
     *   ___  | |__     __ _   _ __   | |_    ___   _ __    | |_   _  __   __   ___
     *  / __| | '_ \   / _` | | '_ \  | __|  / _ \ | '__|   |  _| | | \ \ / /  / _ \
     * | (__  | | | | | (_| | | |_) | | |_  |  __/ | |      | |   | |  \ V /  |  __/
     *  \___| |_| |_|  \__,_| | .__/   \__|  \___| |_|      |_|   |_|   \_/    \___|
     *                        | |
     *                        |_|
     *
     *          HEALTH AND SANITATION
     *
     */

    private String typeOfTreatment = "";
    private String healthPostDistance = "";
    private String hospitalDistance = "";
    private String hivFemale = "";
    private String hivMale = "";
    private String hivOther = "";
    private String malariaFemale = "";
    private String malariaMale = "";
    private String malariaOther = "";
    private String tbFemale = "";
    private String tbMale = "";
    private String tbOther = "";
    private String cancerMale = "";
    private String cancerFemale = "";
    private String cancerOther = "";
    private String sugarFemale = "";
    private String sugarMale = "";
    private String sugarOther = "";
    private String heartFemale = "";
    private String heartMale = "";
    private String heartOther = "";
    private String kidneyFemale = "";
    private String kidneyMale = "";
    private String kidneyOther = "";
    private String otherFemale = "";
    private String otherMale = "";
    private String otherOther = "";
    private String womenDis = "";
    private String sufferingFrom = "";
    private String childrenInjection = "";
    private String bcgGirl = "";
    private String bcgBoy = "";
    private String dptGirl = "";
    private String dptBoy = "";
    private String poliyoGirl = "";
    private String poliyoBoy = "";
    private String dpt2Girl = "";
    private String dpt2Boy = "";
    private String dpt3Girl = "";
    private String dpt3Boy = "";
    private String hibPneumoniaGirl = "";
    private String hibPneumoniaBoy = "";
    private String pcvPneumoniaGirl = "";
    private String pcvPneumoniaBoy = "";
    private String mrDaduraGirl = "";
    private String mrDaduraBoy = "";
    private String japaneseEncephalitisGirl = "";
    private String japaneseEncephalitisBoy = "";
    private String choleraGirl = "";
    private String choleraBoy = "";
    private String hepatitisGirl = "";
    private String hepatitisBoy = "";
    private String otherInjectionGirl = "";
    private String otherInjectionBoy = "";
    private String wormsMedicineGirl = "";
    private String wormsMedicineBoy = "";
    private String vitaminABoy = "";
    private String vitaminAGirl = "";
    private String pregnantGetWormMedicine = "";
    private String pregnantGetBabyTest = "";
    private String pregnantGetHealthCheckup = "";
    private String pregnantGetTitanus = "";
    private String pregnantGetIron = "";
    private String pregnantGetOtherTreatment = "";
    private String ageOfDeliveryFirstChild = "";
    private String ageOfDeliverySecondChild = "";
    private String ageOfDeliveryThirdChild = "";
    private String healthCheckupTimesAfterPregnant = "";
    private String childDeliveryPlace = "";
    private String gettingVitaminA = "";
    private String ironTabletNumber = "";
    private String breastFeedingDurationInMonths = "";
    private String bornHIVInfected = "";
    private String getARVProfilexesService = "";
    private String usedPipedWater = "";
    private String usedWell = "";
    private String usedSourceWater = "";
    private String usedJarWater = "";
    private String usedOther = "";
    private String afterToiletWashHands = "";
    private String beforeMealWashHands = "";
    private String afterMealWashHands = "";
    private String beforeFeedingChildWashHands = "";
    private String afterToiletingChildWashHands = "";
    private String familyHealthInsurance = "";

    public void setTypeOfTreatment(String typeOfTreatment) {
        this.typeOfTreatment = typeOfTreatment;
    }

    public void setHealthPostDistance(String healthPostDistance) {
        this.healthPostDistance = healthPostDistance;
    }

    public void setHospitalDistance(String hospitalDistance) {
        this.hospitalDistance = hospitalDistance;
    }

    public void setHiv(String[] hiv) {
        this.hivMale = hiv[0];
        this.hivFemale = hiv[1];
        this.hivOther = hiv[2];
    }

    public void setMalaria(String[] malaria) {
        this.malariaMale = malaria[0];
        this.malariaFemale = malaria[1];
        this.malariaOther = malaria[2];
    }

    public void setTb(String[] tb) {
        this.tbMale = tb[0];
        this.tbFemale = tb[1];
        this.tbOther = tb[2];
    }

    public void setCancer(String[] cancer) {
        this.cancerMale = cancer[0];
        this.cancerFemale = cancer[1];
        this.cancerOther = cancer[2];
    }

    public void setSugar(String[] sugar) {
        this.sugarMale = sugar[0];
        this.sugarFemale = sugar[1];
        this.sugarOther = sugar[2];
    }

    public void setHeart(String[] heart) {
        this.heartMale = heart[0];
        this.heartFemale = heart[1];
        this.heartOther = heart[2];
    }

    public void setKidney(String[] kidney) {
        this.kidneyMale = kidney[0];
        this.kidneyFemale = kidney[1];
        this.kidneyOther = kidney[2];
    }

    public void setOthers(String[] other) {
        this.otherMale = other[0];
        this.otherFemale = other[1];
        this.otherOther = other[2];
    }

    public void setWomenDis(String womenDis) {
        this.womenDis = womenDis;
    }

    public void setSufferingFrom(String sufferingFrom) {
        this.sufferingFrom = sufferingFrom;
    }

    public void setChildrenInjection(String childrenInjection) {
        this.childrenInjection = childrenInjection;
    }

    public void setBcg(String[] bcg) {
        this.bcgBoy = bcg[0];
        this.bcgGirl = bcg[1];
    }

    public void setDpt(String[] dpt) {
        this.dptBoy = dpt[0];
        this.dptGirl = dpt[1];
    }

    public void setDpt2(String[] dpt2) {
        this.dpt2Boy = dpt2[0];
        this.dpt2Girl = dpt2[1];
    }

    public void setDpt3(String[] dpt3) {
        this.dpt3Boy = dpt3[0];
        this.dpt3Girl = dpt3[1];
    }

    public void setHIBPneumonia(String[] hibPneumonia) {
        this.hibPneumoniaBoy = hibPneumonia[0];
        this.hibPneumoniaGirl = hibPneumonia[1];
    }

    public void setPCVPneumonia(String[] pcvPneumonia) {
        this.pcvPneumoniaBoy = pcvPneumonia[0];
        this.pcvPneumoniaGirl = pcvPneumonia[1];
    }

    public void setMrDadura(String[] mrDadura) {
        this.mrDaduraBoy = mrDadura[0];
        this.mrDaduraGirl = mrDadura[1];
    }

    public void setJapaneseEncephalitis(String[] japaneseEncephalitis) {
        this.japaneseEncephalitisBoy = japaneseEncephalitis[0];
        this.japaneseEncephalitisGirl = japaneseEncephalitis[1];
    }

    public void setPoliyo(String[] poliyo) {
        this.poliyoBoy = poliyo[0];
        this.poliyoGirl = poliyo[1];
    }

    public void setCholera(String[] cholera) {
        this.choleraBoy = cholera[0];
        this.choleraGirl = cholera[1];
    }

    public void setHepatitis(String[] hepatitis) {
        this.hepatitisBoy = hepatitis[0];
        this.hepatitisGirl = hepatitis[1];
    }

    public void setOtherInjection(String[] otherInjection) {
        this.otherInjectionBoy = otherInjection[0];
        this.otherInjectionGirl = otherInjection[1];
    }

    public void setWormsMedicine(String[] wormsMedicine) {
        this.wormsMedicineBoy = wormsMedicine[0];
        this.wormsMedicineGirl = wormsMedicine[1];
    }

    public void setVitaminA(String[] vitaminA) {
        this.vitaminABoy = vitaminA[0];
        this.vitaminAGirl = vitaminA[1];
    }

    public void setPregnantGetWormMedicine(String pregnantGetWormMedicine) {
        this.pregnantGetWormMedicine = pregnantGetWormMedicine;
    }

    public void setPregnantGetBabyTest(String pregnantGetBabyTest) {
        this.pregnantGetBabyTest = pregnantGetBabyTest;
    }

    public void setPregnantGetHealthCheckup(String pregnantGetHealthCheckup) {
        this.pregnantGetHealthCheckup = pregnantGetHealthCheckup;
    }

    public void setPregnantGetTitanus(String pregnantGetTitanus) {
        this.pregnantGetTitanus = pregnantGetTitanus;
    }

    public void setPregnantGetIron(String pregnantGetIron) {
        this.pregnantGetIron = pregnantGetIron;
    }

    public void setPregnantGetOtherTreatment(String pregnantGetOtherTreatment) {
        this.pregnantGetOtherTreatment = pregnantGetOtherTreatment;
    }

    public void setAgeOfDeliveryFirstChild(String ageOfDeliveryFirstChild) {
        this.ageOfDeliveryFirstChild = ageOfDeliveryFirstChild;
    }

    public void setAgeOfDeliverySecondChild(String ageOfDeliverySecondChild) {
        this.ageOfDeliverySecondChild = ageOfDeliverySecondChild;
    }

    public void setAgeOfDeliveryThirdChild(String ageOfDeliveryThirdChild) {
        this.ageOfDeliveryThirdChild = ageOfDeliveryThirdChild;
    }

    public void setHealthCheckupTimesAfterPregnant(String healthCheckupTimesAfterPregnant) {
        this.healthCheckupTimesAfterPregnant = healthCheckupTimesAfterPregnant;
    }

    public void setChildDeliveryPlace(String childDeliveryPlace) {
        this.childDeliveryPlace = childDeliveryPlace;
    }

    public void setGettingVitaminA(String gettingVitaminA) {
        this.gettingVitaminA = gettingVitaminA;
    }

    public void setIronTabletNumber(String ironTabletNumber) {
        this.ironTabletNumber = ironTabletNumber;
    }

    public void setBreastFeedingDurationInMonths(String breastFeedingDurationInMonths) {
        this.breastFeedingDurationInMonths = breastFeedingDurationInMonths;
    }

    public void setBornHIVInfected(String bornHIVInfected) {
        this.bornHIVInfected = bornHIVInfected;
    }

    public void setGetARVProfilexesService(String getARVProfilexesService) {
        this.getARVProfilexesService = getARVProfilexesService;
    }

    public void setUsedPipedWater(String usedPipedWater) {
        this.usedPipedWater = usedPipedWater;
    }

    public void setUsedWell(String usedWell) {
        this.usedWell = usedWell;
    }

    public void setUsedSourceWater(String usedSourceWater) {
        this.usedSourceWater = usedSourceWater;
    }

    public void setUsedJarWater(String usedJarWater) {
        this.usedJarWater = usedJarWater;
    }

    public void setUsedOther(String usedOther) {
        this.usedOther = usedOther;
    }

    public void setAfterToiletWashHands(String afterToiletWashHands) {
        this.afterToiletWashHands = afterToiletWashHands;
    }

    public void setBeforeMealWashHands(String beforeMealWashHands) {
        this.beforeMealWashHands = beforeMealWashHands;
    }

    public void setAfterMealWashHands(String afterMealWashHands) {
        this.afterMealWashHands = afterMealWashHands;
    }

    public void setBeforeFeedingChildWashHands(String beforeFeedingChildWashHands) {
        this.beforeFeedingChildWashHands = beforeFeedingChildWashHands;
    }

    public void setAfterToiletingChildWashHands(String afterToiletingChildWashHands) {
        this.afterToiletingChildWashHands = afterToiletingChildWashHands;
    }

    public void setFamilyHealthInsurance(String familyHealthInsurance) {
        this.familyHealthInsurance = familyHealthInsurance;
    }


}
