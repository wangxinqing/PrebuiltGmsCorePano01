package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: boa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class boa extends Activity {
    private boolean a;
    private String b = null;
    private ModuleManager.FeatureList c = null;
    private FeatureRequestExtras.ResultBuilder d = null;
    private int e = -1;
    private boolean f = false;

    static Intent a(String str) {
        return new Intent("com.google.android.chimera.container.EXTRACT_MODULE_WITH_UI").putExtra("asset_name", str);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        FeatureRequestExtras.ResultReader fromIntent;
        if (i == 1) {
            if (!this.a) {
                this.e = i2;
                this.f = false;
                if (i2 != 0) {
                    ((bjz) getContainerActivity()).o = false;
                    if (a(this, this.a, this.c)) {
                        this.f = true;
                    }
                }
            } else if (i2 != 0) {
                ((bjz) getContainerActivity()).o = false;
                if (new FeatureRequestExtras.RequestReader(getIntent()).hasFeatureRequest() && (fromIntent = FeatureRequestExtras.ResultReader.fromIntent(intent)) != null) {
                    FeatureRequestExtras.ResultBuilder resultBuilder = new FeatureRequestExtras.ResultBuilder();
                    resultBuilder.setDownloadResult(fromIntent.getDownloadResultCode());
                    this.d = resultBuilder;
                }
            }
        } else if (i != 2) {
        } else {
            if (i2 != 0) {
                ((bjz) getContainerActivity()).o = false;
                this.f = true;
                return;
            }
            a((Intent) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r5.isEmpty() == false) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r1 = r16
            super.onCreate(r17)
            awxo r0 = defpackage.awxo.a
            awxv r0 = r0.a()
            boolean r0 = r0.G()
            if (r0 != 0) goto L_0x001b
            android.app.Activity r0 = r16.getContainerActivity()
            android.content.ComponentName r0 = r0.getComponentName()
            r2 = r0
            goto L_0x002d
        L_0x001b:
            android.content.ComponentName r0 = new android.content.ComponentName
            android.app.Activity r2 = r16.getContainerActivity()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.<init>(r1, r2)
            r2 = r0
        L_0x002d:
            android.content.pm.PackageManager r0 = r16.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0043 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0043 }
            android.os.Bundle r3 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0043 }
            if (r3 == 0) goto L_0x003f
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0043 }
            r2 = r0
            goto L_0x006b
        L_0x003f:
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ NameNotFoundException -> 0x0043 }
            r2 = r0
            goto L_0x006b
        L_0x0043:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 32
            r3.<init>(r2)
            java.lang.String r2 = "Failed to fetch <meta-data> for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "ChimeraFallbackActivity"
            android.util.Log.e(r2, r0)
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r2 = r0
        L_0x006b:
            java.lang.String r0 = "chimera.requested_features"
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L_0x0137
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r0.length
            r5.<init>(r6)
            java.lang.String r7 = "(\\w+)(?::(\\*|(?:\\d+)))?"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r8 = 0
            r9 = 0
        L_0x008e:
            if (r9 >= r6) goto L_0x0126
            r10 = r0[r9]
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x0121
            java.util.regex.Matcher r10 = r7.matcher(r10)
            boolean r11 = r10.matches()
            java.lang.String r12 = "FeatureMgr"
            java.lang.String r13 = "Malformed feature descriptor: "
            if (r11 == 0) goto L_0x010b
            r11 = 2
            java.lang.String r14 = r10.group(r11)
            if (r14 == 0) goto L_0x00d7
            java.lang.String r15 = "*"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x00d4
            java.lang.String r14 = r10.group(r11)     // Catch:{ NumberFormatException -> 0x00be }
            long r12 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x00be }
            goto L_0x00d9
        L_0x00be:
            r0 = move-exception
            int r0 = r3.length()
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13)
            goto L_0x00cf
        L_0x00cb:
            java.lang.String r0 = r13.concat(r3)
        L_0x00cf:
            android.util.Log.e(r12, r0)
            r5 = 0
            goto L_0x012e
        L_0x00d4:
            r12 = -1
            goto L_0x00d9
        L_0x00d7:
            r12 = 0
        L_0x00d9:
            boc r14 = defpackage.boc.d
            aucd r14 = r14.o()
            r15 = 1
            java.lang.String r10 = r10.group(r15)
            boolean r4 = r14.c
            if (r4 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r14.c()
            r14.c = r8
        L_0x00ee:
            aucj r4 = r14.b
            boc r4 = (defpackage.boc) r4
            r10.getClass()
            int r8 = r4.a
            r8 = r8 | r15
            r4.a = r8
            r4.b = r10
            r8 = r8 | r11
            r4.a = r8
            r4.c = r12
            aucj r4 = r14.i()
            boc r4 = (defpackage.boc) r4
            r5.add(r4)
            goto L_0x0121
        L_0x010b:
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13)
            goto L_0x011c
        L_0x0118:
            java.lang.String r0 = r13.concat(r3)
        L_0x011c:
            android.util.Log.e(r12, r0)
            r5 = 0
            goto L_0x012e
        L_0x0121:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x008e
        L_0x0126:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r5 = 0
        L_0x012e:
            if (r5 == 0) goto L_0x0135
            com.google.android.chimera.config.ModuleManager$FeatureList r4 = com.google.android.chimera.config.ModuleManager.FeatureList.fromDescriptors(r5)
            goto L_0x0138
        L_0x0135:
            r4 = 0
            goto L_0x0138
        L_0x0137:
            r4 = 0
        L_0x0138:
            r1.c = r4
            defpackage.bkn.b()
            boolean r0 = defpackage.awxs.b()
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "chimera.requiresExtractedAsset"
            java.lang.String r0 = r2.getString(r0)
            r1.b = r0
        L_0x014b:
            awxo r0 = defpackage.awxo.a
            awxv r0 = r0.a()
            boolean r0 = r0.B()
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        super.onResume();
        boolean z = ((bjz) getContainerActivity()).o;
        Intent intent = null;
        if (this.a) {
            if (!this.f && !a(this, true, this.c)) {
                if (z) {
                    ModuleManager.FeatureList featureList = this.c;
                    if (featureList == null) {
                        String str = this.b;
                        if (str != null) {
                            startActivityForResult(a(str), 2);
                            return;
                        }
                    } else {
                        amrl.a((Object) featureList);
                        startActivityForResult(blg.a(featureList).putExtras(getIntent()), 1);
                        return;
                    }
                }
                if (this.d != null) {
                    intent = new Intent();
                    this.d.addToIntent(intent);
                }
                a(intent);
                return;
            }
            ((bjz) getContainerActivity()).o = false;
            recreate();
        } else if (this.f) {
            recreate();
        } else {
            if (z) {
                if (this.e != 0 && a(this, false, this.c)) {
                    String str2 = this.b;
                    if (str2 != null) {
                        startActivityForResult(a(str2), 2);
                        return;
                    }
                } else {
                    ModuleManager.FeatureList featureList2 = this.c;
                    amrl.a((Object) featureList2);
                    startActivityForResult(blg.a(featureList2).putExtras(getIntent()), 1);
                    return;
                }
            }
            a((Intent) null);
        }
    }

    private static boolean a(Context context, boolean z, ModuleManager.FeatureList featureList) {
        if (featureList == null) {
            return !z;
        }
        int checkFeaturesAreAvailable = ModuleManager.get(context).checkFeaturesAreAvailable(featureList);
        if (checkFeaturesAreAvailable == 0) {
            return true;
        }
        if (checkFeaturesAreAvailable == 1 || checkFeaturesAreAvailable == 2) {
            return false;
        }
        Log.w("ChimeraFallbackActivity", "Failed to check features");
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        if (intent == null) {
            setResult(0);
        } else {
            setResult(0, intent);
        }
        finish();
    }
}
