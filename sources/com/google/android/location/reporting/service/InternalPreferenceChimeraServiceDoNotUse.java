package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalPreferenceChimeraServiceDoNotUse extends BoundService {
    public ajmm a;
    public ajld b;
    private final ajlj c = new ajlj(this);

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("PreferenceService ULR dump....");
        if (DispatchingChimeraService.a) {
            printWriter.println("PreferenceService deferring to DispatchingService for dump");
            return;
        }
        ajnw.a(printWriter, (Context) this, this.a, ajmo.a((Context) this));
    }

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        ajnw.a((Context) this);
        this.a = ajmm.a((Context) this);
        this.b = ajld.a((Context) this);
    }
}
