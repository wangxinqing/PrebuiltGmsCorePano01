package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: apcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcf {
    public static final apcf a = new apcf(new apcg());
    public static final apcf b = new apcf(new apck());
    public static final apcf c = new apcf(new apcm());
    public static final apcf d = new apcf(new apcl());
    public static final apcf e = new apcf(new apch());
    public static final apcf f = new apcf(new apcj());
    public static final apcf g = new apcf(new apci());
    private static final Logger h = Logger.getLogger(apcf.class.getName());
    private static final List i;
    private final apcn j;
    private final List k = i;

    static {
        if (!apdb.a()) {
            i = new ArrayList();
        } else {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            i = arrayList;
        }
    }

    public apcf(apcn apcn) {
        this.j = apcn;
    }

    public final Object a(String str) {
        List list = this.k;
        int size = list.size();
        int i2 = 0;
        Exception exc = null;
        while (i2 < size) {
            try {
                return this.j.a(str, (Provider) list.get(i2));
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
                i2++;
            }
        }
        return this.j.a(str, (Provider) null);
    }
}
