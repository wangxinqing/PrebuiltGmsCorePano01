package defpackage;

import android.os.Build;
import android.os.StrictMode;
import android.os.strictmode.CredentialProtectedWhileLockedViolation;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.ImplicitDirectBootViolation;
import android.os.strictmode.InstanceCountViolation;
import android.os.strictmode.LeakedClosableViolation;
import android.os.strictmode.NetworkViolation;
import android.os.strictmode.ResourceMismatchViolation;
import android.os.strictmode.UnbufferedIoViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.os.strictmode.Violation;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;

/* renamed from: ahhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahhw implements StrictMode.OnThreadViolationListener {
    private final ahhx a;

    public ahhw(ahhx ahhx) {
        this.a = ahhx;
    }

    public final void onThreadViolation(Violation violation) {
        ahhx ahhx = this.a;
        ahhy c = ahhz.c();
        c.a(Arrays.asList(violation.getStackTrace()));
        int i = 0;
        if (violation instanceof DiskReadViolation) {
            i = 2;
        } else if (violation instanceof DiskWriteViolation) {
            i = 1;
        } else if (violation instanceof NetworkViolation) {
            i = 4;
        } else if (violation instanceof CustomViolation) {
            i = 8;
        } else if (violation instanceof ResourceMismatchViolation) {
            i = 16;
        } else if (violation instanceof UnbufferedIoViolation) {
            i = 32;
        } else if (violation instanceof InstanceCountViolation) {
            i = 512;
        } else if (violation instanceof LeakedClosableViolation) {
            i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        } else if (violation instanceof UntaggedSocketViolation) {
            i = Integer.MIN_VALUE;
        } else if (Build.VERSION.SDK_INT >= 29) {
            if (violation instanceof CredentialProtectedWhileLockedViolation) {
                i = 2048;
            } else if (violation instanceof ImplicitDirectBootViolation) {
                i = FragmentTransaction.TRANSIT_ENTER_MASK;
            }
        }
        c.a(i);
        if (!ahho.a(ahhx.a, c.a())) {
            anhk i2 = ahhx.b.listIterator();
            while (i2.hasNext()) {
                ((ahhm) i2.next()).a();
            }
        }
    }
}
