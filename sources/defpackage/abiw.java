package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abiw implements View.OnClickListener {
    private final abiz a;
    private final Intent b;

    public abiw(abiz abiz, Intent intent) {
        this.a = abiz;
        this.b = intent;
    }

    public void onClick(View view) {
        abiz abiz = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(abiz.a.getPackageManager()) != null) {
            abiz.b.a(jth.GENERIC_CARD_ENTRY, jth.GENERIC_CARD);
            abiz.a.startActivity(intent);
        }
    }
}
