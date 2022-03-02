package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: dxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxm extends znq implements Filterable {
    public final int a = i();
    public final int b = i();
    public final int c = i();
    public icc d;
    public final Context e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String[] i;
    public final wli j;
    public final boolean k;
    public final boolean l;
    public boolean m;
    public final Collection n;
    public List o;
    public final List p;
    public final LoaderManager q;
    public dzj r;
    public final dxj s;
    public String t;
    public int u;
    public final dxi v = new dxi(this);
    public final znl w = new znl();
    public final dxh x = new dxh(this);
    public dxg y;
    private final dxk z;

    public dxm(Context context, boolean z2, boolean z3, String str, String[] strArr, LoaderManager loaderManager) {
        super(context);
        this.e = context;
        this.f = z2;
        this.g = z3;
        this.h = str;
        this.i = strArr;
        this.q = loaderManager;
        this.s = new dxj(this);
        wlh wlh = new wlh();
        wlh.a = 0;
        wlh.b();
        this.j = wlh.a();
        List asList = Arrays.asList(eap.a(strArr));
        this.k = asList.contains("email");
        this.l = asList.contains("phone");
        this.z = new dxk(this);
        this.n = new LinkedHashSet();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.y = new dxg(this, this.o);
    }

    public static String a(String str) {
        int type;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (!(charAt == '(' || charAt == ')' || charAt == '+' || charAt == '.' || (type = Character.getType(charAt)) == 12 || type == 20)) {
                int digit = Character.digit(charAt, 10);
                if (digit != -1) {
                    sb.append(digit);
                } else {
                    sb.append(charAt);
                }
            }
        }
        return sb.toString();
    }

    public final Filter getFilter() {
        return this.z;
    }
}
