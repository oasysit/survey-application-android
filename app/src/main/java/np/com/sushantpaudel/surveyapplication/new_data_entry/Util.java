package np.com.sushantpaudel.surveyapplication.new_data_entry;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

class Util {

    static String getText(EditText editText) {
        if (editText == null) return "";
        return String.valueOf(editText.getText());
    }

    static String getText(Spinner spinner) {
        if (spinner == null) return "";
        return spinner.getSelectedItem().toString();
    }

    static String getText(CheckBox checkBox) {
        if (checkBox == null) return "";
        return checkBox.isChecked() ? "Yes" : "No";
    }

}
