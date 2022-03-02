package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abfh implements View.OnClickListener {
    private final abfl a;
    private final Intent b;

    public abfh(abfl abfl, Intent intent) {
        this.a = abfl;
        this.b = intent;
    }

    public void onClick(View view) {
        abfl abfl = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(abfl.l.getPackageManager()) != null) {
            abfl.l.startActivity(intent);
        }
    }
}
