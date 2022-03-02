package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.lockbox.LockboxAlarmChimeraReceiver;
import com.google.android.gms.lockbox.LockboxOptInOptions;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import com.google.android.gms.lockbox.internal.LockboxSignedInStatus;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rps extends bhw implements rpt {
    protected static agqu a;
    private final Context b;
    private final String c;
    private final rqc d;
    private final hol e;
    private final hph f;
    private rpu g;

    public rps() {
        super("com.google.android.gms.lockbox.internal.ILockboxService");
    }

    public final LockboxOptInFlags a(Account account) {
        Context context = this.b;
        if (a == null) {
            agqw agqw = new agqw();
            agqw.a(context);
            agqw.b("gmscorelockboxfacsid");
            a = agqw.a();
        }
        try {
            return new LockboxOptInFlags(account.name, ((Boolean) a.a(account).a(4).get(15, TimeUnit.SECONDS)).booleanValue(), false);
        } catch (ExecutionException | TimeoutException e2) {
            return new LockboxOptInFlags(account.name, false, false);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return new LockboxOptInFlags(account.name, false, false);
        }
    }

    public final LockboxSignedInStatus b() {
        String a2;
        String string;
        long j;
        rqc rqc = this.d;
        synchronized (rqc.a) {
            a2 = rqc.a();
        }
        rqc rqc2 = this.d;
        synchronized (rqc2.a) {
            string = rqc2.a.getString("client-instance-id", (String) null);
        }
        rqc rqc3 = this.d;
        synchronized (rqc3.a) {
            j = rqc3.a.getLong("signed-in-timestamp", 0);
        }
        return new LockboxSignedInStatus(a2, string, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rps(Context context, String str) {
        super("com.google.android.gms.lockbox.internal.ILockboxService");
        rqc a2 = rqc.a(context);
        ibq ibq = acyr.a;
        this.b = context;
        this.c = str;
        this.d = a2;
        this.e = new hol(context, "LB_COUNTERS", (String) null);
        this.f = new hph(this.e, "LB_COUNTERS", 100);
    }

    public final LockboxOptInFlags a(String str) {
        if (!ayfw.a.a().a()) {
            this.f.c("GetOptInViaLegacyCheck").a();
            this.f.d();
            return new LockboxOptInFlags(str, this.d.a(str, 1), this.d.a(str, 2));
        } else if (aygf.a.a().a()) {
            return a(new Account(str, "com.google"));
        } else {
            try {
                this.f.c("GetOptInViaUdcAttempt").a();
                hpe c2 = this.f.c();
                acwa m = acyr.a(this.b, new acyq(str)).m();
                ick ick = (ick) acws.a(m, ayfq.b(), TimeUnit.SECONDS);
                c2.a(this.f.f("GetOptInQueryUdcTimer"));
                if (m.b()) {
                    if (ick != null) {
                        this.f.c("GetOptInViaUdcSuccess").a();
                        this.f.d();
                        return new LockboxOptInFlags(str, ick.n(), ick.o());
                    }
                }
                this.f.c("GetOptInViaUdcConnectFail").a();
            } catch (ExecutionException | TimeoutException e2) {
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
            }
            this.f.c("GetOptInViaUdcFallbackAsFalse").a();
            this.f.d();
            return new LockboxOptInFlags(str, false, false);
        }
    }

    public final void a(String str, String str2) {
        if (Binder.getCallingUid() != Process.myUid()) {
            String str3 = this.c;
            String a2 = aygl.a.a().a();
            if (!a2.isEmpty()) {
                TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter<>(',');
                simpleStringSplitter.setString(a2);
                for (String equals : simpleStringSplitter) {
                    if (equals.equals(str3)) {
                    }
                }
            }
            throw new SecurityException("Access denied");
        }
        rqc rqc = this.d;
        synchronized (rqc.a) {
            rqc.a.getString("signed-in-account", (String) null);
            SharedPreferences.Editor edit = rqc.a.edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString("signed-in-account", str);
                edit.putString("client-instance-id", str2);
                edit.putLong("signed-in-timestamp", System.currentTimeMillis());
            } else {
                edit.remove("signed-in-account");
                edit.remove("client-instance-id");
                edit.remove("signed-in-timestamp");
            }
            edit.apply();
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        rpu rpu;
        boolean z;
        boolean z2;
        switch (i) {
            case 2:
                LockboxOptInFlags a2 = a(parcel.readString());
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                break;
            case 3:
                LockboxOptInFlags lockboxOptInFlags = (LockboxOptInFlags) bhx.a(parcel, LockboxOptInFlags.CREATOR);
                String str = lockboxOptInFlags.a;
                this.d.a(str, 1, lockboxOptInFlags.b);
                this.d.a(str, 2, lockboxOptInFlags.c);
                this.d.a(str);
                itg.a(this.b, str, new int[]{8, 7});
                if (lockboxOptInFlags.b || lockboxOptInFlags.c) {
                    Context context = this.b;
                    context.sendBroadcast(LockboxAlarmChimeraReceiver.a(context));
                }
                parcel2.writeNoException();
                break;
            case 4:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxStatusChangedListener");
                    rpu = queryLocalInterface instanceof rpu ? (rpu) queryLocalInterface : new rpu(readStrongBinder);
                } else {
                    rpu = null;
                }
                this.g = rpu;
                synchronized (rqc.c) {
                    rqc.b.add(rpu);
                }
                parcel2.writeNoException();
                break;
            case 5:
                rpu rpu2 = this.g;
                if (rpu2 != null) {
                    synchronized (rqc.c) {
                        rqc.b.remove(rpu2);
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                String readString = parcel.readString();
                LockboxOptInOptions lockboxOptInOptions = (LockboxOptInOptions) bhx.a(parcel, LockboxOptInOptions.CREATOR);
                ArrayList arrayList = new ArrayList();
                int i2 = lockboxOptInOptions.a;
                if (i2 == 0) {
                    z = false;
                } else {
                    if (i2 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.d.a(readString, 1, z);
                    arrayList.add(atzo.SUPPL_WEB_AND_APP);
                }
                int i3 = lockboxOptInOptions.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.d.a(readString, 2, z2);
                    z |= z2;
                    arrayList.add(atzo.DEVICE_INFO);
                }
                this.d.a(readString);
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((atzo) arrayList.get(i4)).l;
                }
                itg.a(this.b, readString, iArr);
                if (z) {
                    Context context2 = this.b;
                    context2.sendBroadcast(LockboxAlarmChimeraReceiver.a(context2));
                }
                parcel2.writeNoException();
                break;
            case 7:
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                LockboxSignedInStatus b2 = b();
                parcel2.writeNoException();
                bhx.b(parcel2, b2);
                break;
            case 9:
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList();
                for (Account account : jgu.d(this.b, this.c)) {
                    LockboxOptInFlags a3 = a(account.name);
                    if (readInt == 1) {
                        if (!a3.b) {
                        }
                    } else if (readInt == 2) {
                        if (!a3.c) {
                        }
                    }
                    arrayList2.add(account.name);
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList2);
                break;
            case 10:
                parcel2.writeNoException();
                bhx.a(parcel2, true);
                break;
            default:
                return false;
        }
        return true;
    }
}
