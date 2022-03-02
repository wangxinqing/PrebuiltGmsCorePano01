package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyv extends nis {
    private final zsg a = zsg.a("FetchRestoreInfoOps");
    private final zvm b;
    private final String c;

    public zyv(zvm zvm, String str) {
        super(135, "FetchRestoreInfoOps");
        this.b = zvm;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        SharedPreferences a2 = zys.a(context);
        ArrayList arrayList = new ArrayList();
        for (String next : a2.getAll().keySet()) {
            if (next.startsWith("last_restore_time:")) {
                String replaceFirst = next.replaceFirst("last_restore_time:", "");
                if (replaceFirst.matches("^[A-Fa-f0-9]+$")) {
                    arrayList.add(new RestoreInfoEntity(replaceFirst, Long.valueOf(a2.getLong(next, 0))));
                }
            }
        }
        this.a.a("Number of backups info returned for account %s: %d", this.c, Integer.valueOf(arrayList.size()));
        this.b.d(Status.a, arrayList);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.d(status, (List) null);
    }
}
