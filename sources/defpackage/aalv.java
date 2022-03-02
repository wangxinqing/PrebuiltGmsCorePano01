package defpackage;

/* renamed from: aalv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aalv {
    public static String a(ozr ozr, ozc ozc, String[] strArr, String str) {
        if (!axsj.a.a().d()) {
            if (!ozr.a.isEmpty()) {
                return null;
            }
            return (strArr != null && strArr.length > 0) ? "Not authorized to read requested corpora" : "Found no matching corpora for package";
        } else if (!ozr.a.isEmpty()) {
            return null;
        } else {
            if (ozr.b.isEmpty()) {
                String str2 = ozc.f;
                if (ozc.a()) {
                    return "Found no matching corpora for package";
                }
                if (str2.equals(str)) {
                    return "Found no matching corpora for package";
                }
            }
            return "Not authorized to read requested corpora";
        }
    }
}
