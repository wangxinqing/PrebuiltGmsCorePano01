package com.google.android.gms.nearby.sharing;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import com.google.android.chimera.ChooserTargetService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DirectShareChimeraService extends ChooserTargetService implements vtx, vsh {
    private Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private CountDownLatch b = new CountDownLatch(1);
    private vts c;

    public final void a(ShareTarget shareTarget) {
        if (this.b.getCount() != 0) {
            long F = ayni.a.a().F();
            this.a.add(shareTarget);
            if (((long) this.a.size()) >= F) {
                this.b.countDown();
                ((anih) vvj.a.d()).a("Discovered required maximum %s share targets for direct share.", F);
            }
        }
    }

    public final void a(ShareTarget shareTarget, int i) {
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
    }

    public final void b(ShareTarget shareTarget) {
        if (this.b.getCount() != 0) {
            this.a.remove(shareTarget);
        }
    }

    public final void onDestroy() {
        this.b.countDown();
        super.onDestroy();
    }

    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = new CountDownLatch(1);
        if (this.c == null) {
            this.c = tcn.c(this);
        }
        this.c.a((vtx) this, (vsh) this, 2);
        ArrayList arrayList = new ArrayList();
        try {
            long G = ayni.a.a().G();
            if (!this.b.await(G, TimeUnit.MILLISECONDS)) {
                ((anih) vvj.a.d()).a("Discovery timed out when reporting chooser targets in %s ms.", G);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ArrayList arrayList2 = new ArrayList(this.a);
        Collections.sort(arrayList2, viz.a);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ShareTarget shareTarget = (ShareTarget) arrayList2.get(i);
            Bundle bundle = new Bundle();
            bundle.putByteArray("direct_share_target_bytes", ivy.a(shareTarget));
            arrayList.add(new ChooserTarget(shareTarget.b, whr.a((Drawable) new vwp(this, shareTarget)), 1.0f, new ComponentName(getPackageName(), "com.google.android.gms.nearby.sharing.InternalShareSheetActivity"), bundle));
        }
        this.c.b((vtx) this);
        ((anih) vvj.a.d()).a("Reporting %s chooser targets in %s ms.", arrayList.size(), System.currentTimeMillis() - currentTimeMillis);
        return arrayList;
    }
}
