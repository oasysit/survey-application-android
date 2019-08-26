package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;

import np.com.sushantpaudel.surveyapplication.R;
import np.com.sushantpaudel.surveyapplication.model.ChapterSix;

import static np.com.sushantpaudel.surveyapplication.new_data_entry.Util.getText;

public class ChapterSixData implements Serializable {
    private Context context;
    private Activity activity;

    ChapterSixData(Context context) {
        this.context = context;
        this.activity = (Activity) context;
    }

    void loadDropdownLists() {
        Spinner spinnerMaleChildBirthRegistered = activity.findViewById(R.id.spinnerMaleChildBirthRegistered);
        Spinner spinnerFemaleChildBirthRegistered = activity.findViewById(R.id.spinnerFemaleChildBirthRegistered);
        Spinner spinnerMaleChildAdmittedInCDC = activity.findViewById(R.id.spinnerMaleChildAdmittedInCDC);
        Spinner spinnerFemaleChildAdmittedInCDC = activity.findViewById(R.id.spinnerFemaleChildAdmittedInCDC);
        Spinner spinnerOtherPeopleLiveWithYourFamily = activity.findViewById(R.id.spinnerOtherPeopleLiveWithYourFamily);
        Spinner spinnerRelativesLiveFor = activity.findViewById(R.id.spinnerRelativesLiveFor);
        Spinner spinnerWorkerBelow18 = activity.findViewById(R.id.spinnerWorkerBelow18);
        Spinner spinnerFamilyMemberGone = activity.findViewById(R.id.spinnerFamilyMemberGone);
        Spinner spinnerChildRepresentativeInMunicipality = activity.findViewById(R.id.spinnerChildRepresentativeInMunicipality);
        Spinner spinnerChildRepresentativeInSMC = activity.findViewById(R.id.spinnerChildRepresentativeInSMC);
        Spinner spinnerChildRepresentativeInHealthCentre = activity.findViewById(R.id.spinnerChildRepresentativeInHealthCentre);
        Spinner spinnerLeaveFamilyWithin5Years = activity.findViewById(R.id.spinnerLeaveFamilyWithin5Years);

        ArrayAdapter<CharSequence> adapterMaleChildBirthRegistered = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterMaleChildBirthRegistered.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMaleChildBirthRegistered.setAdapter(adapterMaleChildBirthRegistered);

        ArrayAdapter<CharSequence> adapterFemaleChildBirthRegistered = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterFemaleChildBirthRegistered.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFemaleChildBirthRegistered.setAdapter(adapterFemaleChildBirthRegistered);

        ArrayAdapter<CharSequence> adapterMaleChildAdmittedInCDC = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterMaleChildAdmittedInCDC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMaleChildAdmittedInCDC.setAdapter(adapterMaleChildAdmittedInCDC);

        ArrayAdapter<CharSequence> adapterFemaleChildAdmittedInCDC = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterFemaleChildAdmittedInCDC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFemaleChildAdmittedInCDC.setAdapter(adapterFemaleChildAdmittedInCDC);

        ArrayAdapter<CharSequence> adapterOtherPeopleLiveWithYourFamily = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterOtherPeopleLiveWithYourFamily.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOtherPeopleLiveWithYourFamily.setAdapter(adapterOtherPeopleLiveWithYourFamily);

        ArrayAdapter<CharSequence> adapterRelativesLiveFor = ArrayAdapter.createFromResource(context,
                R.array.relatives_live_for, android.R.layout.simple_spinner_item);
        adapterRelativesLiveFor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRelativesLiveFor.setAdapter(adapterRelativesLiveFor);

        ArrayAdapter<CharSequence> adapterWorkerBelow18 = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterWorkerBelow18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWorkerBelow18.setAdapter(adapterWorkerBelow18);

        ArrayAdapter<CharSequence> adapterFamilyMemberGone = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterFamilyMemberGone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFamilyMemberGone.setAdapter(adapterFamilyMemberGone);

        ArrayAdapter<CharSequence> adapterChildRepresentativeInMunicipality = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no_unknown, android.R.layout.simple_spinner_item);
        adapterChildRepresentativeInMunicipality.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChildRepresentativeInMunicipality.setAdapter(adapterChildRepresentativeInMunicipality);

        ArrayAdapter<CharSequence> adapterChildRepresentativeInSMC = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no_unknown, android.R.layout.simple_spinner_item);
        adapterChildRepresentativeInSMC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChildRepresentativeInSMC.setAdapter(adapterChildRepresentativeInSMC);

        ArrayAdapter<CharSequence> adapterChildRepresentativeInHealthCentre = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no_unknown, android.R.layout.simple_spinner_item);
        adapterChildRepresentativeInHealthCentre.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerChildRepresentativeInHealthCentre.setAdapter(adapterChildRepresentativeInHealthCentre);

        ArrayAdapter<CharSequence> adapterLeaveFamilyWithin5Years = ArrayAdapter.createFromResource(context,
                R.array.spinner_yes_no, android.R.layout.simple_spinner_item);
        adapterLeaveFamilyWithin5Years.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLeaveFamilyWithin5Years.setAdapter(adapterLeaveFamilyWithin5Years);
    }

    ChapterSix getData() {
        Spinner spinnerMaleChildBirthRegistered = activity.findViewById(R.id.spinnerMaleChildBirthRegistered);
        Spinner spinnerFemaleChildBirthRegistered = activity.findViewById(R.id.spinnerFemaleChildBirthRegistered);
        Spinner spinnerMaleChildAdmittedInCDC = activity.findViewById(R.id.spinnerMaleChildAdmittedInCDC);
        Spinner spinnerFemaleChildAdmittedInCDC = activity.findViewById(R.id.spinnerFemaleChildAdmittedInCDC);
        Spinner spinnerOtherPeopleLiveWithYourFamily = activity.findViewById(R.id.spinnerOtherPeopleLiveWithYourFamily);
        Spinner spinnerRelativesLiveFor = activity.findViewById(R.id.spinnerRelativesLiveFor);
        Spinner spinnerWorkerBelow18 = activity.findViewById(R.id.spinnerWorkerBelow18);
        Spinner spinnerFamilyMemberGone = activity.findViewById(R.id.spinnerFamilyMemberGone);
        Spinner spinnerChildRepresentativeInMunicipality = activity.findViewById(R.id.spinnerChildRepresentativeInMunicipality);
        Spinner spinnerChildRepresentativeInSMC = activity.findViewById(R.id.spinnerChildRepresentativeInSMC);
        Spinner spinnerChildRepresentativeInHealthCentre = activity.findViewById(R.id.spinnerChildRepresentativeInHealthCentre);
        Spinner spinnerLeaveFamilyWithin5Years = activity.findViewById(R.id.spinnerLeaveFamilyWithin5Years);

        EditText typesOfWorkRelative = activity.findViewById(R.id.editTextTypesOfWorkRelative);
        EditText workerWageDailyBasis = activity.findViewById(R.id.editTextWorkerWageDailyBasis);
        EditText workerWageMonthlyBasis = activity.findViewById(R.id.editTextWorkerWageMonthlyBasis);
//        EditText maleWorkType = activity.findViewById(R.id.editTextMaleWorkType);
//        EditText typesOfWorkFamily = activity.findViewById(R.id.editTextTypesOfWorkFamily);
//        EditText familyWorkerWageDailyBasis = activity.findViewById(R.id.editTextFamilyWorkerWageDailyBasis);
        EditText familyWorkerWageMonthlyBasis = activity.findViewById(R.id.editTextFamilyWorkerWageMonthlyBasis);

        ChapterSix data = new ChapterSix();
        data.setMaleChildBirthRegistered(getText(spinnerMaleChildBirthRegistered));
        data.setFemaleChildBirthRegistered(getText(spinnerFemaleChildBirthRegistered));
        data.setMaleChildAdmittedInCDC(getText(spinnerMaleChildAdmittedInCDC));
        data.setFemaleChildAdmittedInCDC(getText(spinnerFemaleChildAdmittedInCDC));
        data.setOtherPeopleLiveWithYourFamily(getText(spinnerOtherPeopleLiveWithYourFamily));
        data.setRelativesLiveFor(getText(spinnerRelativesLiveFor));
        data.setWorkerBelow18(getText(spinnerWorkerBelow18));
        data.setFamilyMemberGone(getText(spinnerFamilyMemberGone));
        data.setChildRepresentativeInMunicipality(getText(spinnerChildRepresentativeInMunicipality));
        data.setChildRepresentativeInSMC(getText(spinnerChildRepresentativeInSMC));
        data.setChildRepresentativeInHealthCentre(getText(spinnerChildRepresentativeInHealthCentre));
        data.setLeaveFamilyWithin5Years(getText(spinnerLeaveFamilyWithin5Years));

        data.setTypesOfWorkRelative(getText(typesOfWorkRelative));
        data.setWorkerWageDailyBasis(getText(workerWageDailyBasis));
        data.setWorkerWageMonthlyBasis(getText(workerWageMonthlyBasis));
//        data.setMaleWorkType(getText(maleWorkType));
//        data.setTypesOfWorkFamily(getText(typesOfWorkFamily));
//        data.setFamilyWorkerWageDailyBasis(getText(familyWorkerWageDailyBasis));
        data.setFamilyWorkerWageMonthlyBasis(getText(familyWorkerWageMonthlyBasis));

        return data;
    }
}
