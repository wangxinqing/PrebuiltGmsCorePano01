package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: lbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbz extends lbs {
    public lbz(String str) {
        super(str, Arrays.asList(new String[]{a(str, "permissionId"), a(str, "displayName"), a(str, "picture"), a(str, "isAuthenticatedUser"), a(str, "emailAddress")}), Collections.emptyList(), 6000000);
    }

    private final String a(String str) {
        return a(this.a, str);
    }

    /* access modifiers changed from: protected */
    public final boolean b(DataHolder dataHolder, int i, int i2) {
        return dataHolder.a(a("permissionId")) && !dataHolder.f(a("permissionId"), i, i2);
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        String c = dataHolder.c(a("permissionId"), i, i2);
        if (c == null) {
            return null;
        }
        String c2 = dataHolder.c(a("displayName"), i, i2);
        String c3 = dataHolder.c(a("picture"), i, i2);
        Boolean valueOf = Boolean.valueOf(dataHolder.d(a("isAuthenticatedUser"), i, i2));
        return new UserMetadata(c, c2, c3, valueOf.booleanValue(), dataHolder.c(a("emailAddress"), i, i2));
    }
}
