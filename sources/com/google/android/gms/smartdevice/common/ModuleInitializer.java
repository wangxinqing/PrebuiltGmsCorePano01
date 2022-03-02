package com.google.android.gms.smartdevice.common;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    private static final amzy a = amzy.a("com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivity", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity", "com.google.android.gms.smartdevice.setup.ui.AccountChallengeActivity", "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity", "com.google.android.gms.smartdevice.magicwand.MagicWandActivity");

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        anhk i = a.listIterator();
        while (i.hasNext()) {
            jhg.a((Context) this, (String) i.next(), true);
        }
    }
}
