package defpackage;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.gms.R;

/* renamed from: vpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vpm implements RadioGroup.OnCheckedChangeListener {
    private final ss a;
    private final RadioButton b;
    private final RadioButton c;
    private final RadioButton d;
    private final RadioGroup e;

    public vpm(ss ssVar, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup) {
        this.a = ssVar;
        this.b = radioButton;
        this.c = radioButton2;
        this.d = radioButton3;
        this.e = radioGroup;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        ss ssVar = this.a;
        RadioButton radioButton = this.b;
        RadioButton radioButton2 = this.c;
        RadioButton radioButton3 = this.d;
        RadioGroup radioGroup2 = this.e;
        int i2 = -1;
        Button a2 = ssVar.a(-1);
        if (a2 != null) {
            boolean z = true;
            if (radioButton.isChecked()) {
                i2 = 2;
            } else if (radioButton2.isChecked()) {
                i2 = 3;
            } else if (radioButton3.isChecked()) {
                i2 = 1;
            }
            if (i2 == ((Integer) radioGroup2.getTag(R.id.data_usage)).intValue()) {
                z = false;
            }
            a2.setEnabled(z);
        }
    }
}
