package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.container.ModuleDependencyDownloadIntentOperation;
import com.google.android.gms.chimera.container.zapp.SynchronizedUpdateBoundService;
import java.util.concurrent.TimeUnit;

/* renamed from: cqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqp extends bhw implements IInterface {
    protected final Context a;
    private final anax b;

    public cqp() {
        super("com.google.android.finsky.zapp.protocol.ISynchronizedUpdateService");
    }

    private static Bundle a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    private final void a() {
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (i < length) {
                if (!"com.android.vending".equals(packagesForUid[i])) {
                    i++;
                } else {
                    return;
                }
            }
        }
        throw new SecurityException("Not Finsky");
    }

    public cqp(Context context) {
        super("com.google.android.finsky.zapp.protocol.ISynchronizedUpdateService");
        this.a = context;
        this.b = anax.a(amsk.a(',').b().a().a((CharSequence) awxo.a.a().L()));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        int i2;
        boolean z;
        int i3;
        hfh hfh;
        Bundle bundle;
        Bundle bundle2;
        int i4 = 2;
        if (i != 1) {
            boolean z2 = false;
            if (i == 2) {
                Bundle bundle3 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                a();
                int i5 = bundle3.getInt("version_code", 0);
                long j = bundle3.getLong("required_disk_space", -1);
                if (i5 <= 0 || j < 0) {
                    i4 = 0;
                } else {
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("onNotifyPendingUpdate: versionCode = ");
                    sb.append(i5);
                    sb.toString();
                    hem.a().a(this.a, 61, String.valueOf(i5));
                    if (!axcu.b()) {
                        hem.a().a(this.a, 62);
                        i4 = 1;
                    } else if (i5 <= 201216073) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("next container version too low: ");
                        sb2.append(i5);
                        sb2.append(":201216073");
                        sb2.toString();
                        hem.a().a(this.a, 66);
                        i4 = 0;
                    } else {
                        hhi a2 = hhi.a(this.a);
                        hhg a3 = a2.a();
                        if (a3 != null) {
                            i2 = a3.b;
                        } else {
                            i2 = 0;
                        }
                        if (i2 != i5) {
                            try {
                                hgp.a(this.a, i5);
                                byte[] bArr = (byte[]) hgp.a.c();
                                if (bArr.length != 0) {
                                    hfh = (hfh) aucj.a((aucj) hfh.b, bArr, aubs.b());
                                } else {
                                    hfh = hfh.b;
                                }
                                aucd o = hhg.e.o();
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                hhg hhg = (hhg) o.b;
                                int i6 = hhg.a | 1;
                                hhg.a = i6;
                                hhg.b = i5;
                                hhg.a = 4 | i6;
                                hhg.d = false;
                                if (hfh.a.size() == 1) {
                                    hhr hhr = new hhr();
                                    hfg hfg = (hfg) hfh.a.get(0);
                                    if (hgi.a(hfg, hhr)) {
                                        ansk ansk = (ansk) hfg.a.get(0);
                                        if (hgi.a(ansk, false) && ansk.e != 0) {
                                            if (o.c) {
                                                o.c();
                                                o.c = false;
                                            }
                                            hhg hhg2 = (hhg) o.b;
                                            hfg.getClass();
                                            hhg2.c = hfg;
                                            hhg2.a |= 2;
                                        }
                                    }
                                    hhr.a(a2.a);
                                }
                                if ((((hhg) o.b).a & 2) == 0) {
                                    StringBuilder sb3 = new StringBuilder(39);
                                    sb3.append("Invalid module set list for ");
                                    sb3.append(i5);
                                    Log.w("SyncUpdateMgr", sb3.toString());
                                }
                                if (!a2.a((hhg) o.i())) {
                                    hem.a().a(this.a, 69);
                                    i4 = 1;
                                }
                            } catch (auda e) {
                                throw new hgo(6, e);
                            } catch (hgo e2) {
                                String valueOf = String.valueOf(e2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 44);
                                sb4.append("Failed to get phenotype for next container: ");
                                sb4.append(valueOf);
                                Log.w("SyncUpdateSvc", sb4.toString());
                                hem.a().a(this.a, 67, e2.getMessage());
                                i4 = 1;
                            }
                        }
                        synchronized (a2.b) {
                            hhg a4 = a2.a();
                            if (a4 != null) {
                                if ((a4.a & 2) != 0) {
                                    if (a2.c == null) {
                                        z2 = true;
                                    }
                                    amtf.a(z2);
                                    hhh hhh = new hhh();
                                    a2.c = hhh;
                                    try {
                                        hek.a(a2.a).a(6, (boj) null, (String) null, amzy.h());
                                        hhh.a.await(awxp.e(), TimeUnit.SECONDS);
                                    } catch (InterruptedException e3) {
                                        String valueOf2 = String.valueOf(e3);
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                                        sb5.append("Interruped while waiting for next container download: ");
                                        sb5.append(valueOf2);
                                        Log.e("SyncUpdateMgr", sb5.toString());
                                        Thread.currentThread().interrupt();
                                    } catch (Throwable th) {
                                        synchronized (a2.b) {
                                            a2.c = null;
                                            throw th;
                                        }
                                    }
                                    synchronized (a2.b) {
                                        a2.c = null;
                                    }
                                    z = hhh.b;
                                }
                            }
                            hem.a().a(a2.a, 68);
                            z = true;
                        }
                        hem a5 = hem.a();
                        Context context = this.a;
                        if (!z) {
                            i3 = 70;
                        } else {
                            i3 = 63;
                        }
                        a5.a(context, i3);
                        if (z || axcu.a.a().b()) {
                            i4 = 1;
                        }
                    }
                }
                Bundle bundle4 = new Bundle();
                bundle4.putInt("status_code", i4);
                parcel2.writeNoException();
                bhx.b(parcel2, bundle4);
            } else if (i == 3) {
                a();
                byte[] byteArray = ((Bundle) bhx.a(parcel, Bundle.CREATOR)).getByteArray("module_dep_req_bytes");
                if (byteArray == null) {
                    bundle = a("status_code", 2);
                } else {
                    byte[] a6 = a(byteArray, true);
                    if (a6 == null) {
                        bundle = a("status_code", 0);
                    } else {
                        Bundle a7 = a("status_code", 1);
                        a7.putByteArray("module_dep_resp_bytes", a6);
                        bundle = a7;
                    }
                }
                parcel2.writeNoException();
                bhx.b(parcel2, bundle);
            } else if (i != 4) {
                return false;
            } else {
                a();
                byte[] byteArray2 = ((Bundle) bhx.a(parcel, Bundle.CREATOR)).getByteArray("module_dep_req_bytes");
                if (byteArray2 == null) {
                    bundle2 = a("status_code", 2);
                } else {
                    byte[] a8 = a(byteArray2, false);
                    if (a8 == null) {
                        bundle2 = a("status_code", 0);
                    } else {
                        Bundle a9 = a("status_code", 1);
                        a9.putByteArray("module_dep_resp_bytes", a8);
                        bundle2 = a9;
                    }
                }
                parcel2.writeNoException();
                bhx.b(parcel2, bundle2);
            }
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr, boolean z) {
        if (!awxo.f()) {
            return null;
        }
        try {
            aedn aedn = (aedn) aucj.a((aucj) aedn.c, bArr, aubs.b());
            if (aedn.a.isEmpty() || (!this.b.contains(aedn.a) && !this.b.contains("*"))) {
                return SynchronizedUpdateBoundService.a(7);
            }
            ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
            aucx aucx = aedn.b;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                aedl aedl = (aedl) aucx.get(i);
                int a2 = aeds.a(aedl.c);
                if (a2 != 0 && a2 == 2) {
                    featureCheck.checkFeatureAtVersion(aedl.a, aedl.b);
                }
            }
            int checkFeaturesAreAvailable = ModuleManager.get(this.a).checkFeaturesAreAvailable(featureCheck);
            if (checkFeaturesAreAvailable == 0) {
                return SynchronizedUpdateBoundService.a(3);
            }
            if (checkFeaturesAreAvailable == 1) {
                return SynchronizedUpdateBoundService.a(5);
            }
            if (checkFeaturesAreAvailable != 2) {
                if (checkFeaturesAreAvailable != 3) {
                    return null;
                }
                return SynchronizedUpdateBoundService.a(2);
            } else if (z) {
                aucd o = aedo.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aedo aedo = (aedo) o.b;
                aedo.b = 3;
                aedo.a |= 1;
                return ((aedo) o.i()).k();
            } else {
                Context context = this.a;
                context.startService(ModuleDependencyDownloadIntentOperation.a(context, bArr));
                return SynchronizedUpdateBoundService.a(6);
            }
        } catch (auda e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unable to parse input proto: ");
            sb.append(valueOf);
            Log.e("SyncUpdateSvc", sb.toString());
            return null;
        }
    }
}
