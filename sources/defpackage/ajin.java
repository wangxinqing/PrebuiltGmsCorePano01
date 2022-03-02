package defpackage;

import android.accounts.Account;
import com.google.android.ulr.ApiMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ajin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajin {
    public final ajim a;
    public final ajik b;

    public ajin(ajik ajik, ajim ajim) {
        this.a = ajim;
        this.b = ajik;
    }

    public final void a(Account account, ApiMetadata apiMetadata, String str) {
        boolean z;
        if (azsy.c() && this.b != null) {
            atco a2 = ajnq.a(apiMetadata);
            if (a2 != null) {
                z = this.b.a(Collections.singletonList(account), a2, str);
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("DatastoreSelector Grpc ApiMetadata put 3: ");
            sb.append(z);
            sb.toString();
            return;
        }
        this.a.a(Collections.singletonList(account), apiMetadata, str);
    }

    public final boolean a(List list, ApiMetadata apiMetadata, String str) {
        boolean z;
        if (!azsy.c() || this.b == null) {
            return this.a.a(list, apiMetadata, str);
        }
        atco a2 = ajnq.a(apiMetadata);
        if (a2 != null) {
            z = this.b.a(list, a2, str);
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("DatastoreSelector Grpc ApiMetadata put 1: ");
        sb.append(z);
        sb.toString();
        return z;
    }

    public final boolean a(List list, List list2, String str) {
        boolean z = true;
        if (azsy.c() && this.b != null) {
            ArrayList<atco> arrayList = new ArrayList<>();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                atco a2 = ajnq.a((ApiMetadata) list2.get(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (!arrayList.isEmpty()) {
                ajik ajik = this.b;
                if (!arrayList.isEmpty()) {
                    synchronized (ajik.c) {
                        if (ajik.d != null) {
                            ajij ajij = new ajij();
                            try {
                                for (atco atco : arrayList) {
                                    aucd o = ajjr.g.o();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    ajjr ajjr = (ajjr) o.b;
                                    atco.getClass();
                                    ajjr.d = atco;
                                    ajjr.a |= 4;
                                    ajik.a(ajij, list, atco.b, (ajjr) o.i(), str);
                                }
                                boolean a3 = ajik.a(ajij, str);
                                z = a3;
                            } finally {
                                ajij.a();
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder(47);
                sb.append("DatastoreSelector Grpc ApiMetadata put 2: ");
                sb.append(z);
                sb.toString();
                return z;
            }
            z = false;
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("DatastoreSelector Grpc ApiMetadata put 2: ");
            sb2.append(z);
            sb2.toString();
            return z;
        }
        ajim ajim = this.a;
        if (list2.isEmpty()) {
            return true;
        }
        synchronized (ajim.c) {
            if (ajim.d == null) {
                return false;
            }
            ajil ajil = new ajil();
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ApiMetadata apiMetadata = (ApiMetadata) it.next();
                    aucd o2 = ajjs.g.o();
                    String jag = apiMetadata.toString();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    ajjs ajjs = (ajjs) o2.b;
                    jag.getClass();
                    ajjs.a |= 4;
                    ajjs.d = jag;
                    ajim.a(ajil, list, apiMetadata.b().longValue(), (ajjs) o2.i(), str);
                }
                boolean a4 = ajim.a(ajil, str);
                return a4;
            } finally {
                ajil.a();
            }
        }
    }
}
