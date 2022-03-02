package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: mso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mso implements View.OnClickListener {
    private final mta a;

    public mso(mta mta) {
        this.a = mta;
    }

    public void onClick(View view) {
        mta mta = this.a;
        sr srVar = new sr(mta.getContext());
        srVar.b(17039370, (DialogInterface.OnClickListener) new mst(mta));
        srVar.a(17039360, (DialogInterface.OnClickListener) null);
        srVar.a((CharSequence) mta.getContext().getString(R.string.bluetooth_unpair_dialog_body, new Object[]{mta.f.getText().toString()}));
        srVar.b().show();
    }
}
