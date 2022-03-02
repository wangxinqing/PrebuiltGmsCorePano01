package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: qid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qid extends qic {
    final /* synthetic */ qij b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qid(qij qij) {
        super(qij, "queryIntentActivities");
        this.b = qij;
    }

    public final Bundle a(Bundle bundle) {
        ArrayList arrayList;
        ResolveInfo a;
        qgw a2;
        int i;
        String str;
        if (!axuy.a.a().a()) {
            return null;
        }
        if (jkr.e()) {
            return new Bundle();
        }
        Intent intent = (Intent) bundle.getParcelable("intent");
        int i2 = bundle.getInt("flags");
        try {
            qhj qhj = this.b.d;
            arrayList = new ArrayList();
            String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : intent.getPackage();
            if (TextUtils.isEmpty(packageName)) {
                qiz qiz = ((qhk) qhj).a;
                qiz.b();
                ArrayList arrayList2 = new ArrayList();
                qgx b2 = qiz.c.b();
                try {
                    a2 = qiz.c.a(b2);
                    a2.c();
                    while (true) {
                        if (!a2.e()) {
                            break;
                        }
                        String str2 = new String(a2.a(), qfb.b);
                        if (str2.endsWith("-m")) {
                            str = str2.substring(0, str2.length() - 2);
                        } else {
                            str = null;
                        }
                        byte[] b3 = a2.b();
                        if (str != null) {
                            if (b3 != null) {
                                arrayList2.add(Pair.create(str, (qhb) aucj.a((aucj) qhb.j, b3, aubs.b())));
                            }
                        }
                        a2.d();
                    }
                    a2.close();
                    b2.close();
                    int size = arrayList2.size();
                    for (i = 0; i < size; i++) {
                        Pair pair = (Pair) arrayList2.get(i);
                        ResolveInfo a3 = qhk.a((String) pair.first, (qhb) pair.second, intent, i2);
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            } else {
                qhb b4 = ((qhk) qhj).a.b(packageName);
                if (!(b4 == null || (a = qhk.a(packageName, b4, intent, i2)) == null)) {
                    arrayList.add(a);
                }
            }
        } catch (IOException e) {
            arrayList = new ArrayList();
            qfp.a(this.b.c, e.getMessage(), e, qij.a);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("result", arrayList);
        return bundle2;
        throw th;
    }
}
