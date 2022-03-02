package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: hiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hiv {
    public final anaf a;
    private final String b;

    public hiv(List list, String str) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hiw hiw = (hiw) it.next();
            hashMap.put(hiw.a, hiw);
        }
        iva.b(hashMap.containsKey(str), "The default key needs to be included in the key list.");
        this.a = anaf.a((Map) hashMap);
        this.b = str;
    }

    public static hiv a(hiw hiw, aqpd aqpd) {
        iva.a((Object) hiw, (Object) "cryptographerKey cannot be null");
        iva.a((Object) aqpd, (Object) "nigoriSpecifics cannot be null");
        ArrayList arrayList = new ArrayList();
        arrayList.add(hiw);
        hiv hiv = new hiv(amzy.a((Object) hiw), hiw.a);
        hme hme = aqpd.a;
        if (hme == null) {
            hme = hme.d;
        }
        arrayList.addAll(a(hiv, hme));
        hme hme2 = aqpd.a;
        if (hme2 == null) {
            hme2 = hme.d;
        }
        return new hiv(arrayList, hme2.b);
    }

    public static List a(hiv hiv, hme hme) {
        if (hme != null && !hme.b.isEmpty()) {
            iva.a((Object) hme, (Object) "encryptedData cannot be null");
            String str = hme.b;
            iva.a(str, (Object) "keyName cannot be empty");
            if (hiv.a.containsKey(str)) {
                try {
                    hmh hmh = (hmh) aucj.a((aucj) hmh.b, hiv.a(hme), aubs.c());
                    if (hmh.a.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        aucx aucx = hmh.a;
                        int size = aucx.size();
                        for (int i = 0; i < size; i++) {
                            arrayList.add(hiw.a((hmg) aucx.get(i)));
                        }
                        return arrayList;
                    }
                    throw new hix("Invalid key bag.");
                } catch (auda | hix e) {
                    throw new hix("Unable to parse the key bag.", e);
                }
            }
        }
        throw new hix("The key bag cannot be decrypted.");
    }

    public static boolean a(aqpd aqpd) {
        iva.a((Object) aqpd);
        aqpc a2 = aqpc.a(aqpd.b);
        if (a2 == null) {
            a2 = aqpc.UNRECOGNIZED;
        }
        return a2 == aqpc.KEYSTORE_PASSPHRASE;
    }

    public final hiw a() {
        return (hiw) this.a.get(this.b);
    }

    public final hme a(byte[] bArr) {
        iva.a((Object) bArr, (Object) "data cannot be null");
        hiw a2 = a();
        aucd o = hme.d.o();
        String str = a2.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hme hme = (hme) o.b;
        str.getClass();
        hme.a |= 1;
        hme.b = str;
        auay a3 = auay.a(a2.b.a(bArr));
        if (o.c) {
            o.c();
            o.c = false;
        }
        hme hme2 = (hme) o.b;
        a3.getClass();
        hme2.a |= 2;
        hme2.c = a3;
        return (hme) o.i();
    }

    public final byte[] a(hme hme) {
        iva.a((Object) hme, (Object) "encryptedData cannot be null");
        int i = hme.a;
        if ((i & 1) == 0) {
            throw new hix("Missing key name.");
        } else if ((i & 2) != 0) {
            String str = hme.b;
            byte[] k = hme.c.k();
            hiw hiw = (hiw) this.a.get(str);
            if (hiw != null) {
                return hiw.b.b(k);
            }
            throw new hix("No valid key found for decrypting the data.");
        } else {
            throw new hix("Missing encrypted data.");
        }
    }
}
