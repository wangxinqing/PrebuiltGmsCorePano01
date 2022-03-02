package defpackage;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ong  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ong implements aef {
    public final HelpChimeraActivity a;
    public CharSequence b = "";
    private final oar c;

    public ong(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
        this.c = helpChimeraActivity.l;
    }

    public final one a() {
        return this.a.w;
    }

    public final void b(String str) {
    }

    public final void a(CharSequence charSequence, boolean z) {
        this.b = charSequence;
        a().a(charSequence, z);
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        this.a.e(str);
        new ool(this.c, new omv(str)).start();
        return true;
    }
}
