package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: cpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cpz {
    public final cqm a;

    public cpz(cqm cqm) {
        this.a = cqm;
    }

    public static Bundle b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString("version_code", str2);
        return bundle;
    }

    public final int a(String str, String str2) {
        try {
            return this.a.a(b(str, str2)).getInt("module_status");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c(String str, String str2) {
        try {
            this.a.c(b(str, str2)).getBoolean("delete_successful");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
