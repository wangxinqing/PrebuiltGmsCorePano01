package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: qtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qtg {
    private static final amsk a = amsk.a(',').a().b();

    public static List a(Collection collection, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set<String> a2 = qtd.a(sQLiteDatabase, str);
            if (!a2.isEmpty()) {
                for (String c : a2) {
                    aply d = aplz.d();
                    d.d(str);
                    d.c(c);
                    arrayList.add(d);
                }
            } else {
                aply d2 = aplz.d();
                d2.d(str);
                arrayList.add(d2);
            }
        }
        new Object[1][0] = arrayList;
        return arrayList;
    }

    public static aply b(Collection collection, SQLiteDatabase sQLiteDatabase) {
        if (collection.isEmpty()) {
            return null;
        }
        String str = (String) collection.iterator().next();
        aply d = aplz.d();
        d.d(str);
        Set a2 = qtd.a(sQLiteDatabase, str);
        if (!a2.isEmpty()) {
            d.c((String) a2.iterator().next());
        }
        new Object[1][0] = d;
        return d;
    }

    public static qtf n() {
        qtf qtf = new qtf();
        qtf.a(false);
        qtf.b(0);
        qtf.a(0);
        qtf.a("text_plain");
        return qtf;
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract Integer d();

    public abstract Integer e();

    public abstract long f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract int j();

    public abstract String k();

    public abstract String l();

    public abstract boolean m();

    /* access modifiers changed from: package-private */
    public final boolean o() {
        return a(d(), b());
    }

    /* access modifiers changed from: package-private */
    public final Set p() {
        String g = g();
        if (!TextUtils.isEmpty(g)) {
            return anax.a(a.a((CharSequence) g));
        }
        return anfv.a;
    }

    static boolean a(Integer num, String str) {
        Integer num2 = 1;
        if ((!"sms".equals(str) || !num2.equals(num)) && (!"mms".equals(str) || !num2.equals(num))) {
            return false;
        }
        return true;
    }

    public final aplu a(SQLiteDatabase sQLiteDatabase) {
        String str;
        aply a2 = aplz.a();
        a2.b(c());
        a2.c(h() != null ? h() : "");
        aplt aplt = new aplt();
        aplt.a(j());
        aplt.b();
        a2.a(aplt);
        if (i() != null) {
            a2.a("text", i());
        }
        if (e() != null) {
            aply aply = new aply("Conversation");
            String valueOf = String.valueOf(e());
            iva.a((Object) valueOf);
            aply.a("id", valueOf);
            aply[] aplyArr = {aply};
            iva.a((Object) aplyArr);
            a2.a("isPartOf", aplyArr);
        }
        Date date = new Date(f());
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            str = "unread";
        } else {
            str = "read";
        }
        arrayList.add(str);
        Set p = p();
        if (o()) {
            arrayList.add("inbox");
            iva.a((Object) date);
            a2.a("dateReceived", date.getTime());
            aply b = b(p, sQLiteDatabase);
            if (b != null) {
                a2.a(b);
            }
        } else {
            arrayList.add("sent");
            iva.a((Object) date);
            a2.a("dateSent", date.getTime());
            List a3 = a((Collection) p, sQLiteDatabase);
            if (!a3.isEmpty()) {
                a2.a((aply[]) a3.toArray(new aply[0]));
            }
        }
        if (!(!"mms".equals(b()) || k() == null || l() == null)) {
            String[] split = k().split(",");
            String[] strArr = {"text_plain"};
            Object[] objArr = null;
            if (split != null) {
                Class<?> componentType = strArr.getClass().getComponentType();
                Object[] objArr2 = (Object[]) Array.newInstance(componentType, r8);
                int i = 0;
                for (String str2 : split) {
                    if (!ius.a(strArr[0], str2)) {
                        objArr2[i] = str2;
                        i++;
                    }
                }
                if (objArr2 != null) {
                    objArr = i != objArr2.length ? Arrays.copyOf(objArr2, i) : objArr2;
                }
            }
            String[] strArr2 = (String[]) objArr;
            String[] split2 = TextUtils.split(l(), ",");
            int length = strArr2.length;
            int length2 = split2.length;
            if (length == length2) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    if (strArr2[i2].startsWith("image_")) {
                        aply aply2 = new aply("Photograph");
                        aply2.b(split2[i2]);
                        arrayList2.add(aply2);
                    } else if (!strArr2[i2].startsWith("video_")) {
                        qoi.b("Unknown content type: %s", strArr2[i2]);
                    } else {
                        aply aply3 = new aply("VideoObject");
                        aply3.b(split2[i2]);
                        arrayList2.add(aply3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    a2.a("messageAttachment", (aply[]) arrayList2.toArray(new aply[0]));
                }
            } else {
                qoi.b("contentTypes and mediaUris have different lengths (%d and %d).", Integer.valueOf(length), Integer.valueOf(length2));
            }
        }
        a2.a((String[]) arrayList.toArray(new String[0]));
        return a2.a();
    }
}
