package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: abkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abkv implements View.OnClickListener {
    private final abkz a;
    private final Intent b;
    private final boolean c;

    public abkv(abkz abkz, Intent intent, boolean z) {
        this.a = abkz;
        this.b = intent;
        this.c = z;
    }

    public void onClick(View view) {
        abkz abkz = this.a;
        Intent intent = this.b;
        boolean z = this.c;
        if (intent.resolveActivity(abkz.a.getPackageManager()) != null) {
            abkz.b.a(jth.HANGOUT_BUTTON, jth.SMART_PROFILE_HEADER);
            Activity activity = abkz.a;
            activity.startActivity(abfz.a((Context) activity, abkz.d, abkz.c, z));
        }
    }
}
