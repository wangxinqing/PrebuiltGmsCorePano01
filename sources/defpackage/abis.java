package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abis implements View.OnClickListener {
    private final abiv a;
    private final Intent b;

    public abis(abiv abiv, Intent intent) {
        this.a = abiv;
        this.b = intent;
    }

    public void onClick(View view) {
        abiv abiv = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(abiv.a.getPackageManager()) != null) {
            abiv.a.startActivity(intent);
        }
    }
}
