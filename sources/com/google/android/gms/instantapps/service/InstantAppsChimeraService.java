package com.google.android.gms.instantapps.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppsChimeraService extends jaz {
    public InstantAppsChimeraService() {
        super(121, "com.google.android.gms.instantapps.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        if (!qfq.a(this).r.a()) {
            jbb.a(16, (Bundle) null);
        } else {
            jbb.a(new qlb(this, getServiceRequest));
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.println();
        qfq a = qfq.a(this);
        if (!a.r.a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", new Object[]{Boolean.valueOf(aecx.a())});
        printWriter.printf("Accounts: %s\n", new Object[]{Arrays.toString(a.c.d())});
        printWriter.printf("Opt-in account: %s\n", new Object[]{a.c.a()});
        printWriter.printf("Opt-in state: %s\n", new Object[]{Integer.valueOf(a.d.a())});
        a.g.a(printWriter);
    }
}
