package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: hzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hzs implements AdapterView.OnItemClickListener {
    private final SimpleDialogAccountPickerChimeraActivity a;
    private final ss b;

    public hzs(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity, ss ssVar) {
        this.a = simpleDialogAccountPickerChimeraActivity;
        this.b = ssVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.a;
        ss ssVar = this.b;
        simpleDialogAccountPickerChimeraActivity.g = i;
        ssVar.a(-1).setEnabled(true);
    }
}
