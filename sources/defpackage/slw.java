package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: slw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class slw implements Callable {
    private final sly a;

    public slw(sly sly) {
        this.a = sly;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.List, java.lang.Iterable] */
    public final Object call() {
        boolean z;
        sly sly = this.a;
        ahac ahac = new ahac();
        Uri uri = sly.c;
        try {
            ahab.a(uri);
            List<String> pathSegments = uri.getPathSegments();
            boolean z2 = true;
            ahbx.a(pathSegments.size() >= 2, "URI must specify a module", new Object[0]);
            ahbx.a(pathSegments.get(0).equals("managed"), "URI must be in 'managed' location", new Object[0]);
            ahac.b = uri.buildUpon().path(TextUtils.join(File.separator, pathSegments.subList(0, 2))).build();
            ahac.a = sly.b;
            ahac.c.addAll((Collection) sly.a.a());
            if (ahac.a != null) {
                z = true;
            } else {
                z = false;
            }
            ahbx.b(z, "Storage must be set", new Object[0]);
            if (ahac.b == null) {
                z2 = false;
            }
            ahbx.b(z2, "BaseUri must be set", new Object[0]);
            ahad ahad = new ahad(ahac);
            if (!ahad.a.c(ahad.b)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ? f = ahad.a.f(ahad.b);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                Uri uri2 = (Uri) f.get(i);
                if (!ahad.c.contains(agzv.a(uri2.getPathSegments().get(2)))) {
                    try {
                        ahad.a.a(uri2, new ahck(), new agzk[0]);
                    } catch (IOException e) {
                        arrayList.add(e);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            throw ahbt.a("Failed to delete one or more account files", arrayList);
        } catch (ahbk e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
