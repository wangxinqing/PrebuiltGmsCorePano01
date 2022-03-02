package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearFieldCommunication$1 extends nla {
    public final /* synthetic */ uls a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearFieldCommunication$1(uls uls, String str) {
        super(str);
        this.a = uls;
    }

    public final void a(Context context, Intent intent) {
        Tag tag;
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) && (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG")) != null) {
            this.a.a((Runnable) new ulq(this, tag));
        }
    }
}
