package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import java.util.List;

/* renamed from: wol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wol extends wnd {
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int s;
    private final String t;
    private final int u;
    private final int v;

    public final DataHolder[] c(Context context) {
        int i;
        List list;
        boolean z;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        int i2 = this.e;
        boolean z2 = this.f;
        int i3 = this.g;
        int i4 = this.s;
        String str4 = this.t;
        int i5 = this.u;
        int i6 = this.v;
        int i7 = i3 | 7;
        String a = ycm.a(str3);
        if (i5 != 0) {
            i = i5;
        } else if (TextUtils.isEmpty(a)) {
            i = 3;
        } else {
            i = 2;
        }
        if (!TextUtils.isEmpty(str4)) {
            list = Arrays.asList(new String[]{ycm.f(str4)});
        } else {
            list = null;
        }
        if (((int) aywy.a.a().a()) != 1) {
            z = false;
        } else {
            z = true;
        }
        int i8 = i6;
        int i9 = i;
        int i10 = i8;
        String str5 = str4;
        DataHolder a2 = wop.a(context, str, str2, (String) null, list, i7, z2, 0, a, i2, i9, i4, z);
        try {
            return new DataHolder[]{a2, wop.a(context, (String) null, str5, i10)};
        } catch (SQLiteException e2) {
            SQLiteException sQLiteException = e2;
            a2.close();
            throw sQLiteException;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wol(String str, int i, wzv wzv, String str2, String str3, String str4, int i2, boolean z, int i3, int i4, String str5, int i5, int i6) {
        super(str, i, wzv, true, str2, "LoadPeopleForAggregation");
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = z;
        this.g = i3;
        this.s = i4;
        this.t = str5;
        this.u = i5;
        this.v = i6;
    }
}
