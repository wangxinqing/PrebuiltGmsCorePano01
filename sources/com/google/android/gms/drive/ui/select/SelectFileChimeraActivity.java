package com.google.android.gms.drive.ui.select;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;
import com.google.android.gms.drive.ui.select.path.SearchPathElement;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectFileChimeraActivity extends lnx implements loo, lpw {
    private lpq c;

    public static lpd a(Context context, String str, String str2, String str3) {
        return new lpd(context, str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public final void e() {
        lpq lpq = this.c;
        PathStack pathStack = lpq.h;
        icc icc = lpq.g;
        if (pathStack.c.isEmpty()) {
            if (jzf.e.a(icc).a.equals(pathStack.d)) {
                pathStack.c = PathStack.a((PathElement) lqj.a);
                pathStack.a();
            } else {
                jzf.e.a(icc, pathStack.d).a(icc).a((icm) new lqc(pathStack));
            }
        }
        Selection selection = lpq.i;
        icc icc2 = lpq.g;
        if (!selection.b()) {
            selection.a(icc2, selection.c);
        }
        lpq.d();
        lpq.b();
    }

    public final void onBackPressed() {
        lpq lpq = this.c;
        lpq.k = null;
        if (lpq.h.b() != null) {
            PathStack pathStack = lpq.h;
            iva.a(!pathStack.c.isEmpty(), (Object) "Not initialized yet");
            if (pathStack.c.size() != 1) {
                if (lpq.n.isEnabled()) {
                    lpq.h.a(lpq.g);
                    return;
                }
                return;
            }
        }
        lpq.a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dialogTitle");
        if (stringExtra == null) {
            stringExtra = getString(R.string.drive_pick_entry_dialog_title_pick_an_item);
            intent.putExtra("dialogTitle", stringExtra);
        }
        setTitle((CharSequence) stringExtra);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        lpq lpq = (lpq) supportFragmentManager.findFragmentByTag("selectFileFragment");
        this.c = lpq;
        if (lpq == null) {
            lpq lpq2 = new lpq();
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            lpq2.setArguments(extras);
            this.c = lpq2;
            supportFragmentManager.beginTransaction().add(16908290, this.c, "selectFileFragment").commit();
        }
        this.c.setHasOptionsMenu(true);
        if (bundle == null) {
            setResult(0);
        }
    }

    public final boolean onSearchRequested() {
        lpq lpq = this.c;
        if (!lpq.g.i()) {
            return true;
        }
        if (lpq.h.b() instanceof SearchPathElement) {
            lpq.h.a(lpq.g);
            return true;
        }
        lpq.h.a(new SearchPathElement(""));
        return true;
    }

    public final void a(int i, DriveId driveId) {
        this.c.a(i, driveId);
    }

    public final void a(lqu lqu, lqs lqs) {
        this.c.a(lqu, lqs);
    }
}
