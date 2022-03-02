package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;

/* renamed from: abu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abu extends aan {
    final int c;
    final int d;
    public abt e;
    private MenuItem f;

    public abu(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        int i = Build.VERSION.SDK_INT;
        if (configuration.getLayoutDirection() != 1) {
            this.c = 22;
            this.d = 21;
            return;
        }
        this.c = 21;
        this.d = 22;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: wm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            abt r0 = r8.e
            if (r0 == 0) goto L_0x00bf
            android.widget.ListAdapter r0 = r8.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            r2 = 0
            if (r1 == 0) goto L_0x001a
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            wq r0 = (defpackage.wq) r0
            goto L_0x001d
        L_0x001a:
            wq r0 = (defpackage.wq) r0
            r1 = 0
        L_0x001d:
            int r3 = r9.getAction()
            r4 = 10
            r5 = -1
            r6 = 0
            if (r3 == r4) goto L_0x0045
            float r3 = r9.getX()
            int r3 = (int) r3
            float r4 = r9.getY()
            int r4 = (int) r4
            int r3 = r8.pointToPosition(r3, r4)
            if (r3 == r5) goto L_0x0045
            int r3 = r3 - r1
            if (r3 < 0) goto L_0x0045
            int r1 = r0.getCount()
            if (r3 >= r1) goto L_0x0045
            ww r1 = r0.getItem(r3)
            goto L_0x0046
        L_0x0045:
            r1 = r6
        L_0x0046:
            android.view.MenuItem r3 = r8.f
            if (r3 == r1) goto L_0x00bf
            wt r0 = r0.a
            if (r3 == 0) goto L_0x005f
            abt r3 = r8.e
            abv r3 = (defpackage.abv) r3
            abt r3 = r3.b
            if (r3 == 0) goto L_0x005f
            wl r3 = (defpackage.wl) r3
            wn r3 = r3.a
            android.os.Handler r3 = r3.a
            r3.removeCallbacksAndMessages(r0)
        L_0x005f:
            r8.f = r1
            if (r1 == 0) goto L_0x00bf
            abt r3 = r8.e
            abv r3 = (defpackage.abv) r3
            abt r3 = r3.b
            if (r3 == 0) goto L_0x00bf
            wl r3 = (defpackage.wl) r3
            wn r4 = r3.a
            android.os.Handler r4 = r4.a
            r4.removeCallbacksAndMessages(r6)
            wn r4 = r3.a
            java.util.List r4 = r4.b
            int r4 = r4.size()
        L_0x007c:
            if (r2 >= r4) goto L_0x008f
            wn r7 = r3.a
            java.util.List r7 = r7.b
            java.lang.Object r7 = r7.get(r2)
            wm r7 = (defpackage.wm) r7
            wt r7 = r7.b
            if (r0 == r7) goto L_0x0090
            int r2 = r2 + 1
            goto L_0x007c
        L_0x008f:
            r2 = -1
        L_0x0090:
            if (r2 == r5) goto L_0x00bf
            int r2 = r2 + 1
            wn r4 = r3.a
            java.util.List r4 = r4.b
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x00aa
            wn r4 = r3.a
            java.util.List r4 = r4.b
            java.lang.Object r2 = r4.get(r2)
            r6 = r2
            wm r6 = (defpackage.wm) r6
            goto L_0x00ab
        L_0x00aa:
        L_0x00ab:
            wk r2 = new wk
            r2.<init>(r3, r6, r1, r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            wn r1 = r3.a
            android.os.Handler r1 = r1.a
            r6 = 200(0xc8, double:9.9E-322)
            long r4 = r4 + r6
            r1.postAtTime(r2, r0, r4)
        L_0x00bf:
            boolean r9 = super.onHoverEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abu.onHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((wq) getAdapter()).a.a(false);
            return true;
        }
    }
}
