package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhj extends ile implements icl {
    private final String b;
    private final int c;
    private final Status d;
    private final boolean e;

    public rhj(DataHolder dataHolder, boolean z, int i) {
        super(dataHolder);
        this.d = ris.h(dataHolder.e);
        switch (i) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                this.c = i;
                this.e = z;
                Bundle bundle = dataHolder.f;
                if (bundle != null) {
                    this.b = bundle.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.b = null;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new ilj(this.a, i);
    }

    public final Status aO() {
        return this.d;
    }

    public final String toString() {
        iur a = ius.a(this);
        a.a("status", this.d);
        a.a("attributions", this.b);
        return a.toString();
    }

    public final void a(Intent intent) {
        ArrayList arrayList = new ArrayList(a());
        Iterator it = iterator();
        long j = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rhi rhi = (rhi) ((rhi) it.next()).r();
            if (rhi instanceof HierarchicalPlaceLikelihoodEntity) {
                HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) rhi;
                j += (long) ivy.a(hierarchicalPlaceLikelihoodEntity).length;
                if (j <= 400000) {
                    arrayList.add(hierarchicalPlaceLikelihoodEntity);
                } else if (Log.isLoggable("HPlaceLikelihoodBuffer", 5)) {
                    Log.w("HPlaceLikelihoodBuffer", String.format("Reached Binder size limit. Returned %d of %d results", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(a())}));
                }
            }
        }
        ivy.a((Iterable) arrayList, intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY");
        ivy.a((SafeParcelable) this.d, intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY");
        intent.putExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", this.c);
        intent.putExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", this.e);
    }
}
