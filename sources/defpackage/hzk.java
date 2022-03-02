package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.OriginalSimpleAccountPickerChimeraActivity;

/* renamed from: hzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hzk implements AdapterView.OnItemClickListener {
    final /* synthetic */ ss a;
    final /* synthetic */ OriginalSimpleAccountPickerChimeraActivity b;

    public hzk(OriginalSimpleAccountPickerChimeraActivity originalSimpleAccountPickerChimeraActivity, ss ssVar) {
        this.b = originalSimpleAccountPickerChimeraActivity;
        this.a = ssVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.d = i;
        this.a.a(-1).setEnabled(true);
    }
}
