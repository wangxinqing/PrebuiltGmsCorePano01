package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: ama  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ama implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ DropDownPreference a;

    public ama(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.a.i[i].toString();
            if (!charSequence.equals(this.a.j) && this.a.b((Object) charSequence)) {
                this.a.a(charSequence);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
