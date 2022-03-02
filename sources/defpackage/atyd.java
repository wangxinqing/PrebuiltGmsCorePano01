package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: atyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atyd {
    private static final amre b = amre.a("-");
    public final atye a = new atye();

    public final String a(String str) {
        Map.Entry entry;
        boolean z;
        Map.Entry entry2;
        boolean z2;
        boolean z3;
        String str2;
        atye atye = this.a;
        String str3 = atye.a;
        Map map = atye.b;
        Map map2 = atye.c;
        if (map2.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.entrySet().iterator();
            Iterator it2 = map2.entrySet().iterator();
            if (it.hasNext()) {
                entry = (Map.Entry) it.next();
            } else {
                entry = null;
            }
            if (it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
                z = false;
            } else {
                entry2 = null;
                z = false;
            }
            while (true) {
                if (entry == null && entry2 == null) {
                    if (z) {
                        arrayList.add(str3.substring(0, 0));
                    }
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    String valueOf = String.valueOf(b.a((Iterable) arrayList));
                    return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
                }
                if (entry2 == null) {
                    z2 = true;
                } else if (entry != null) {
                    int compareTo = ((atyb) entry.getKey()).compareTo((atyb) entry2.getKey());
                    z2 = compareTo < 0;
                    if (compareTo == 0) {
                        entry = null;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    atyb atyb = (atyb) entry2.getKey();
                    atyf atyf = (atyf) entry2.getValue();
                    if (z) {
                        arrayList.add(str3.substring(0, 0));
                    }
                    if (atyf.a != null) {
                        boolean z4 = atyf.b;
                        String str4 = atyb.aP;
                        int i = atyb.aQ;
                        int i2 = i - 1;
                        if (i != 0) {
                            switch (i2) {
                                case 0:
                                    str2 = anml.f.a().a(aook.b(((Long) ((atyf) entry2.getValue()).a).longValue()));
                                    break;
                                case 1:
                                    str2 = "";
                                    break;
                                case 2:
                                    str2 = ((String) ((atyf) entry2.getValue()).a).replace(';', ':');
                                    break;
                                case 3:
                                    str2 = ((Integer) ((atyf) entry2.getValue()).a).toString();
                                    break;
                                case 4:
                                    str2 = ((Long) ((atyf) entry2.getValue()).a).toString();
                                    break;
                                case 5:
                                    str2 = ((Float) ((atyf) entry2.getValue()).a).toString();
                                    break;
                                case 6:
                                    String valueOf2 = String.valueOf(String.format("%08x", new Object[]{Integer.valueOf(((Integer) ((atyf) entry2.getValue()).a).intValue())}));
                                    if (valueOf2.length() != 0) {
                                        str2 = "0x".concat(valueOf2);
                                        break;
                                    } else {
                                        str2 = new String("0x");
                                        break;
                                    }
                                default:
                                    String a2 = atya.a(i);
                                    StringBuilder sb = new StringBuilder(a2.length() + 24);
                                    sb.append("OptionType ");
                                    sb.append(a2);
                                    sb.append(" not handled.");
                                    throw new IllegalStateException(sb.toString());
                            }
                            String valueOf3 = String.valueOf(str4);
                            String valueOf4 = String.valueOf(str2);
                            arrayList.add(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4));
                            entry2 = null;
                            z3 = false;
                        } else {
                            throw null;
                        }
                    } else {
                        entry2 = null;
                        z3 = false;
                    }
                } else {
                    atyc atyc = (atyc) entry.getValue();
                    if (!z) {
                        int i3 = atyc.a;
                        int i4 = atyc.b;
                        entry = null;
                        z3 = true;
                    } else {
                        int i5 = atyc.a;
                        arrayList.add(str3.substring(0, 0));
                        int i6 = atyc.a;
                        int i7 = atyc.b;
                        entry = null;
                        z3 = true;
                    }
                }
                if (entry == null && it.hasNext()) {
                    entry = (Map.Entry) it.next();
                }
                if (entry2 == null && it2.hasNext()) {
                    entry2 = (Map.Entry) it2.next();
                }
            }
        } else if (str3.isEmpty()) {
            return "";
        } else {
            return str3.length() == 0 ? new String(str) : str.concat(str3);
        }
    }
}
