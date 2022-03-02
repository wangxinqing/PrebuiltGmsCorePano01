package com.google.android.gms.checkin;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckinIntentOperationService extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if (awrq.t()) {
            gyb gyb = (gyb) gyb.a.b();
            gyb.d.a();
            anhk i = gyb.e.listIterator();
            while (i.hasNext()) {
                ((gyr) i.next()).b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        CheckinChimeraService.a((Context) this);
        EventLogChimeraService.a(false, (Context) this);
        CheckinChimeraService.a(getBaseContext(), false, 2, false, false, (Intent) null);
    }
}
