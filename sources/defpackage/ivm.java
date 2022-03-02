package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: ivm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ivm implements SharedPreferences {
    private SharedPreferences a;
    private final boolean b;
    private final Context c;
    private final String d;
    private final boolean e;

    public ivm(Context context, String str, boolean z, boolean z2) {
        this.d = str;
        if (z) {
            this.c = context.getApplicationContext();
        } else {
            if (z2) {
                this.c = aekv.d(context.getApplicationContext());
            } else {
                this.c = context.getApplicationContext();
            }
            this.a = this.c.getSharedPreferences(str, 0);
            if (awyg.c()) {
                this.a = new ivi(this.a);
            }
        }
        this.b = z;
        this.e = z2;
        if (!z2) {
            return;
        }
        if (z) {
            Bundle a2 = a(this.c, this.d, a("moveSharedPreferencesFrom", (String) null));
            if (a2 != null) {
                a2.getBoolean("moveSharedPreferencesFrom", false);
            }
        } else if (aekv.a() && aekv.b(context) && !context.isDeviceProtectedStorage()) {
            this.c.moveSharedPreferencesFrom(context, this.d);
        }
    }

    public static Bundle a(Context context, String str, Bundle bundle) {
        iuh iuh;
        hwz hwz = new hwz();
        Intent intent = new Intent("com.google.android.gms.common.BIND_SHARED_PREFS").setPackage("com.google.android.gms");
        jca a2 = jca.a();
        int a3 = (int) awyg.a.a().a();
        if (a3 <= 0) {
            a3 = 1;
        }
        int i = 0;
        while (i < a3) {
            if (!a2.a(context, intent, hwz, 1)) {
                a2.a(context, (ServiceConnection) hwz);
                Log.w("SharedPreferences", "binding to PrefService failed. Retry in 1 second");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e2) {
                }
                i++;
            } else {
                try {
                    IBinder a4 = hwz.a();
                    if (a4 != null) {
                        IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.common.internal.ISharedPreferencesService");
                        iuh = !(queryLocalInterface instanceof iuh) ? new iuf(a4) : (iuh) queryLocalInterface;
                    } else {
                        iuh = null;
                    }
                    Bundle a5 = iuh.a(str, 0, bundle);
                    jca.a().a(context, (ServiceConnection) hwz);
                    return a5;
                } catch (InterruptedException e3) {
                    Log.e("SharedPreferences", "Bind to SharedPreferencesService interrupted");
                } catch (RemoteException e4) {
                    Log.e("SharedPreferences", "Bind to SharedPreferencesService interrupted");
                } catch (IllegalArgumentException e5) {
                    String valueOf = String.valueOf(e5.getMessage());
                    Log.e("SharedPreferences", valueOf.length() == 0 ? new String("Error communicating with SharedPreferencesService: ") : "Error communicating with SharedPreferencesService: ".concat(valueOf));
                } catch (Throwable th) {
                    jca.a().a(context, (ServiceConnection) hwz);
                    throw th;
                }
            }
        }
        throw new ivj(new RemoteException());
        jca.a().a(context, (ServiceConnection) hwz);
        return null;
    }

    public final boolean contains(String str) {
        if (!this.b) {
            return this.a.contains(str);
        }
        Bundle a2 = a(this.c, this.d, a("contains", str));
        if (a2 != null) {
            return a2.getBoolean("contains", false);
        }
        return false;
    }

    public final Map getAll() {
        if (!this.b) {
            return this.a.getAll();
        }
        Bundle a2 = a(this.c, this.d, a("getAll", (String) null));
        return a2 == null ? Collections.EMPTY_MAP : (Map) a2.getSerializable("getAll");
    }

    public final boolean getBoolean(String str, boolean z) {
        if (!this.b) {
            return this.a.getBoolean(str, z);
        }
        Bundle a2 = a(this.c, this.d, a("getBoolean", str));
        return a2 != null ? a2.getBoolean("getBoolean", z) : z;
    }

    public final float getFloat(String str, float f) {
        if (!this.b) {
            return this.a.getFloat(str, f);
        }
        Bundle a2 = a(this.c, this.d, a("getFloat", str));
        return a2 != null ? a2.getFloat("getFloat", f) : f;
    }

    public final int getInt(String str, int i) {
        if (!this.b) {
            return this.a.getInt(str, i);
        }
        Bundle a2 = a(this.c, this.d, a("getInt", str));
        return a2 != null ? a2.getInt("getInt", i) : i;
    }

    public final long getLong(String str, long j) {
        if (!this.b) {
            return this.a.getLong(str, j);
        }
        Bundle a2 = a(this.c, this.d, a("getLong", str));
        return a2 != null ? a2.getLong("getLong", j) : j;
    }

    public final String getString(String str, String str2) {
        if (!this.b) {
            return this.a.getString(str, str2);
        }
        Bundle a2 = a(this.c, this.d, a("getString", str));
        return a2 != null ? a2.getString("getString") : str2;
    }

    public final Set getStringSet(String str, Set set) {
        String[] strArr;
        if (!this.b) {
            return this.a.getStringSet(str, set);
        }
        Bundle a2 = a(this.c, this.d, a("getStringSet", str));
        if (a2 != null) {
            strArr = a2.getStringArray("getStringSet");
        } else {
            strArr = null;
        }
        if (strArr != null) {
            set = new ob();
            for (String add : strArr) {
                set.add(add);
            }
        }
        return set;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (!this.b) {
            this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (!this.b) {
            this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    private final Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("FUNCTION_NAME", str);
        bundle.putString("KEY_NAME", str2);
        bundle.putBoolean("isDirectBoot", this.e);
        return bundle;
    }

    /* renamed from: a */
    public final ivl edit() {
        return new ivl(this.c, this.a, this.d, this.b, this.e);
    }
}
