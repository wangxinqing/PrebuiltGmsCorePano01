package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentSection;

/* renamed from: dvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvb {
    public static bazc a(Bundle bundle) {
        bazb bazb = (bazb) bazc.d.o();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                aucd o = bazd.g.o();
                String str2 = (String) obj;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                bazd bazd = (bazd) o.b;
                str2.getClass();
                bazd.a |= 2;
                bazd.c = str2;
                bazd bazd2 = (bazd) o.i();
                aucd o2 = baza.d.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                baza baza = (baza) o2.b;
                str.getClass();
                int i = baza.a | 1;
                baza.a = i;
                baza.b = str;
                bazd2.getClass();
                baza.c = bazd2;
                baza.a = i | 2;
                bazb.a((baza) o2.i());
            } else if (obj instanceof Bundle) {
                aucd o3 = bazd.g.o();
                bazc a = a((Bundle) obj);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                bazd bazd3 = (bazd) o3.b;
                a.getClass();
                bazd3.f = a;
                bazd3.a |= 16;
                bazd bazd4 = (bazd) o3.i();
                aucd o4 = baza.d.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                baza baza2 = (baza) o4.b;
                str.getClass();
                int i2 = baza2.a | 1;
                baza2.a = i2;
                baza2.b = str;
                bazd4.getClass();
                baza2.c = bazd4;
                baza2.a = i2 | 2;
                bazb.a((baza) o4.i());
            } else if (obj instanceof String[]) {
                for (String str3 : (String[]) obj) {
                    if (str3 != null) {
                        aucd o5 = bazd.g.o();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        bazd bazd5 = (bazd) o5.b;
                        str3.getClass();
                        bazd5.a |= 2;
                        bazd5.c = str3;
                        bazd bazd6 = (bazd) o5.i();
                        aucd o6 = baza.d.o();
                        if (o6.c) {
                            o6.c();
                            o6.c = false;
                        }
                        baza baza3 = (baza) o6.b;
                        str.getClass();
                        int i3 = baza3.a | 1;
                        baza3.a = i3;
                        baza3.b = str;
                        bazd6.getClass();
                        baza3.c = bazd6;
                        baza3.a = i3 | 2;
                        bazb.a((baza) o6.i());
                    }
                }
            } else if (obj instanceof Bundle[]) {
                for (Bundle bundle2 : (Bundle[]) obj) {
                    if (bundle2 != null) {
                        aucd o7 = bazd.g.o();
                        bazc a2 = a(bundle2);
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        bazd bazd7 = (bazd) o7.b;
                        a2.getClass();
                        bazd7.f = a2;
                        bazd7.a |= 16;
                        bazd bazd8 = (bazd) o7.i();
                        aucd o8 = baza.d.o();
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        baza baza4 = (baza) o8.b;
                        str.getClass();
                        int i4 = baza4.a | 1;
                        baza4.a = i4;
                        baza4.b = str;
                        bazd8.getClass();
                        baza4.c = bazd8;
                        baza4.a = i4 | 2;
                        bazb.a((baza) o8.i());
                    }
                }
            } else if (obj instanceof Boolean) {
                aucd o9 = bazd.g.o();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                bazd bazd9 = (bazd) o9.b;
                bazd9.a |= 1;
                bazd9.b = booleanValue;
                bazd bazd10 = (bazd) o9.i();
                aucd o10 = baza.d.o();
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                baza baza5 = (baza) o10.b;
                str.getClass();
                int i5 = baza5.a | 1;
                baza5.a = i5;
                baza5.b = str;
                bazd10.getClass();
                baza5.c = bazd10;
                baza5.a = i5 | 2;
                bazb.a((baza) o10.i());
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unsupported value: ");
                sb.append(valueOf);
                Log.e("SearchIndex", sb.toString());
            }
        }
        if (bundle.containsKey("type")) {
            String string = bundle.getString("type");
            if (bazb.c) {
                bazb.c();
                bazb.c = false;
            }
            bazc bazc = (bazc) bazb.b;
            string.getClass();
            bazc.a |= 1;
            bazc.b = string;
        }
        return (bazc) bazb.i();
    }

    public static DocumentSection a(String str, bazc bazc) {
        dtn dtn = new dtn(str);
        dtn.b = true;
        dtn.f = str;
        dtn.a = "blob";
        return new DocumentSection(bazc.k(), dtn.a());
    }
}
