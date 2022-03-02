package defpackage;

import androidx.preference.Preference;

/* renamed from: ahns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahns implements amk {
    private final ahnu a;

    public ahns(ahnu ahnu) {
        this.a = ahnu;
    }

    public final boolean a(Preference preference, Object obj) {
        ahnu ahnu = this.a;
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        preference.a((CharSequence) str);
        ahnt ahnt = ahnu.d;
        if (ahnt == null) {
            return true;
        }
        ahnt.a(str);
        return true;
    }
}
