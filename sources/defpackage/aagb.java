package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.libs.scheduler.PendingCallback;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.firebase.appindexing.internal.Thing;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

/* renamed from: aagb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aagb extends aafb {
    public final osf a;

    public aagb(osf osf, Bundle bundle, ozc ozc) {
        super(aonk.DIAGNOSTIC, 1, 4, osf.b, bundle, ozc);
        this.a = osf;
    }

    private final void a(Writer writer) {
        this.a.e();
        PrintWriter printWriter = new PrintWriter(writer);
        osf osf = this.a;
        pxd.a(osf.b, printWriter, new String[]{"native", "verbose"}, osf);
        printWriter.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final BundleResponse a() {
        String str;
        FileOutputStream fileOutputStream;
        Throwable th;
        Cursor query;
        Throwable th2;
        String str2;
        String str3;
        String str4;
        int i;
        Bundle bundle = new Bundle();
        ((Bundle) this.n).setClassLoader(Thing.class.getClassLoader());
        String string = ((Bundle) this.n).getString("name");
        ArrayList arrayList = new ArrayList();
        if (string == null) {
            str = "No operation named";
        } else if ("flush".equals(string)) {
            osf osf = this.a;
            osf.e();
            ppp ppp = osf.c;
            orl orl = new orl(osf, aonk.FLUSH_INDEX);
            ppp.d(orl);
            arrayList.add(orl);
            str = null;
        } else if ("commit".equals(string)) {
            this.a.f();
            str = null;
        } else if ("clear".equals(string)) {
            osf osf2 = this.a;
            osf2.o();
            arrayList.add(osf2.a(true));
            str = null;
        } else if ("killGmsCore".equals(string)) {
            Process.killProcess(Process.myPid());
            str = null;
        } else if ("compact".equals(string)) {
            arrayList.add(this.a.g());
            str = null;
        } else if ("rebuild".equals(string)) {
            osf osf3 = this.a;
            osf3.e();
            ppp ppp2 = osf3.c;
            orm orm = new orm(osf3, aonk.REBUILD_INDEX);
            ppp2.d(orm);
            arrayList.add(orm);
            str = null;
        } else if ("compactAndPurge".equals(string)) {
            if (((Bundle) this.n).containsKey("target")) {
                double d = ((Bundle) this.n).getDouble("target");
                osf osf4 = this.a;
                osf4.e();
                ppp ppp3 = osf4.c;
                oro oro = new oro(osf4, aonk.COMPACT_AND_PURGE_INDEX, d);
                ppp3.d(oro);
                arrayList.add(oro);
                str = null;
            } else {
                str = "No target free for compactAndPurge specified";
            }
        } else if ("getDebugString".equals(string)) {
            if (!((Bundle) this.n).getBoolean("deflated", false)) {
                StringWriter stringWriter = new StringWriter();
                a((Writer) stringWriter);
                bundle.putString("debug", stringWriter.toString());
                str = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new DeflaterOutputStream(byteArrayOutputStream), "UTF-8");
                    a((Writer) outputStreamWriter);
                    outputStreamWriter.close();
                } catch (IOException e) {
                }
                bundle.putByteArray("deflated_debug", byteArrayOutputStream.toByteArray());
                str = null;
            }
        } else if ("copyIndexToLocation".equals(string)) {
            if (!Build.TAGS.contains("test-keys")) {
                bundle.putString("debug", "Operation disabled on non-rooted devices for data security reasons.");
                str = null;
            } else {
                String string2 = ((Bundle) this.n).getString("output_folder_for_dump", "");
                if (!string2.isEmpty()) {
                    if (!NativeIndex.nativeCopyIndexToDirectory(this.a.n.b, string2, ozy.a().k())) {
                        String valueOf = String.valueOf(string2);
                        bundle.putString("debug", valueOf.length() == 0 ? new String("Failed copying over index to: ") : "Failed copying over index to: ".concat(valueOf));
                        str = null;
                    } else {
                        String valueOf2 = String.valueOf(string2);
                        bundle.putString("debug", valueOf2.length() == 0 ? new String("Successfully copied index to: ") : "Successfully copied index to: ".concat(valueOf2));
                        str = null;
                    }
                } else {
                    bundle.putString("debug", "index-copy failed - no output folder provided.");
                    str = null;
                }
            }
        } else if ("readresources".equals(string)) {
            ppp ppp4 = this.a.c;
            aafw aafw = new aafw(this, aonk.READ_CLIENT_INFO_FROM_RESOURCES);
            ppp4.d(aafw);
            arrayList.add(aafw);
            str = null;
        } else if ("maintenance".equals(string)) {
            arrayList.add(this.a.h());
            osf osf5 = this.a;
            ppp ppp5 = osf5.c;
            oxg oxg = new oxg(osf5);
            ppp5.d(oxg);
            arrayList.add(oxg);
            str = null;
        } else if ("maintenance_intent".equals(string)) {
            Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
            intent.setClassName(this.a.b.getPackageName(), "com.google.android.gms.icing.service.IndexWorkerService");
            intent.putExtra("tag", "maintenance");
            this.a.b.startService(intent);
            str = null;
        } else if ("InternalCorporaMaintenance".equals(string)) {
            pnm.c(this.a.b);
            str = null;
        } else if ("slurpUsageReports".equals(string)) {
            osf osf6 = this.a;
            ppp ppp6 = osf6.c;
            ovi ovi = new ovi(osf6, false, true);
            ppp6.d(ovi);
            arrayList.add(ovi);
            str = null;
        } else if ("uploadAppHistory".equals(string)) {
            osf osf7 = this.a;
            ppp ppp7 = osf7.c;
            Context context = osf7.b;
            prp prp = osf7.g;
            ozs a2 = osf7.a();
            osf osf8 = this.a;
            ozb ozb = osf8.m;
            pas pas = osf8.t;
            NativeIndex nativeIndex = osf8.n;
            oyq oyq = osf8.r;
            oyt n = osf8.n();
            osf osf9 = this.a;
            opx opx = r7;
            opx opx2 = new opx(context, prp, a2, ozb, pas, nativeIndex, oyq, osf8, n, osf9.u, osf9.v);
            ppp7.d(opx);
            arrayList.add(opx);
            str = null;
        } else if ("dummyTask".equals(string)) {
            ppp ppp8 = this.a.c;
            ppr ppr = new ppr(aonk.DIAGNOSTIC);
            ppp8.d(ppr);
            arrayList.add(ppr);
            str = null;
        } else if ("startRecording".equals(string)) {
            pxo pxo = this.a.y;
            if (!pxo.e) {
                synchronized (pxo.a) {
                    oso.a("Start recording");
                    pxo.b = true;
                }
                List b = pxo.b();
                synchronized (pxo.a) {
                    if (b != null) {
                        try {
                            i = b.size();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } else {
                        i = 0;
                    }
                    pxo.d = i;
                }
                str = null;
            } else {
                oso.e("Trying to record queries in prod build, ignoring.");
                str = null;
            }
        } else if ("stopRecording".equals(string)) {
            pxo pxo2 = this.a.y;
            synchronized (pxo2.a) {
                oso.a("Stop recording");
                pxo2.b = false;
            }
            str = null;
        } else if ("clearRecording".equals(string)) {
            pxo pxo3 = this.a.y;
            synchronized (pxo3.a) {
                pxo3.c.delete();
                pxo3.d = 0;
            }
            str = null;
        } else if ("getRecords".equals(string)) {
            List b2 = this.a.y.b();
            if (b2 != null) {
                int i2 = ((Bundle) this.n).getInt("query_record_index");
                try {
                    bundle.putByteArray("query_record", ((oub) b2.get(i2)).k());
                } catch (IndexOutOfBoundsException e2) {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Record not found for index ");
                    sb.append(i2);
                    oso.b(sb.toString());
                    str = null;
                }
            }
            str = null;
        } else if ("updateAppParams".equals(string)) {
            osf osf10 = this.a;
            ppp ppp9 = osf10.c;
            Context context2 = osf10.b;
            prp prp2 = osf10.g;
            ozs a3 = osf10.a();
            osf osf11 = this.a;
            aamd aamd = new aamd(context2, prp2, a3, osf11.m, osf11.t, osf11.e);
            ppp9.d(aamd);
            arrayList.add(aamd);
            str = null;
        } else if ("appIndexingCallAsGmsCore".equals(string)) {
            String string3 = ((Bundle) this.n).getString("app_indexing_api_call_type");
            if (string3.isEmpty()) {
                str = "Must set app_indexing_api_call_type parameter";
            } else if (string3.equals("update")) {
                arrayList.add(new aaga(aplf.a(this.a.b).a((Thing) ((Bundle) this.n).getParcelable("app_indexing_update_param"))));
                str = null;
            } else if (string3.equals("patch")) {
                arrayList.add(new aaga(aplf.a(this.a.b).b((Thing) ((Bundle) this.n).getParcelable("app_indexing_update_param"))));
                str4 = null;
            } else {
                str4 = "app_indexing_api_call_type is not supported yet.";
            }
        } else if ("clearAppData".equals(string)) {
            String string4 = ((Bundle) this.n).getString("package_name");
            if (!TextUtils.isEmpty(string4)) {
                ppp ppp10 = this.a.c;
                aafx aafx = new aafx(this, aonk.CLEAR_APP_DATA, string4);
                ppp10.d(aafx);
                arrayList.add(aafx);
                str3 = null;
            } else {
                str3 = "Must set package_name parameter";
            }
        } else if ("appIndexingOneoffRebuildIndex".equals(string)) {
            String string5 = ((Bundle) this.n).getString("package_name");
            if (!TextUtils.isEmpty(string5)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("packageName", string5);
                a("com.google.android.gms.icing.indexapi.OneoffRebuildIndexService", bundle2);
                str2 = null;
            } else {
                str2 = "Must set package_name parameter";
            }
        } else if ("appIndexingPeriodicRebuildIndex".equals(string)) {
            a("com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService", (Bundle) null);
            str = null;
        } else if ("appIndexingEnableErrorCache".equals(string)) {
            oxx.a(this.a.b).a(((Bundle) this.n).getBoolean("error_cache_preference"));
            str = null;
        } else if ("clearCorpusData".equals(string)) {
            String string6 = ((Bundle) this.n).getString("package_name");
            String string7 = ((Bundle) this.n).getString("corpus_name");
            if (!TextUtils.isEmpty(string6) && !TextUtils.isEmpty(string7)) {
                ppp ppp11 = this.a.c;
                aafy aafy = new aafy(this, aonk.CLEAR_CORPUS_DATA, string6, string7);
                ppp11.d(aafy);
                arrayList.add(aafy);
                str = null;
            } else {
                str = "Must set both package_name and corpus_name parameters";
            }
        } else if ("getSequenceTableSummary".equals(string)) {
            String string8 = ((Bundle) this.n).getString("package_name");
            String string9 = ((Bundle) this.n).getString("extended_type_name");
            if (!TextUtils.isEmpty(string8) && !TextUtils.isEmpty(string9)) {
                try {
                    ovw a4 = ovw.a(this.a.b, string8);
                    if (a4 == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(string8).length() + 24);
                        sb2.append("Package ");
                        sb2.append(string8);
                        sb2.append(" is blacklisted.");
                        str = sb2.toString();
                    } else {
                        query = a4.getReadableDatabase().query(oyc.a(oxe.a(string9, string8)), new String[]{"seqno"}, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
                        int count = query.getCount();
                        long[] jArr = new long[count];
                        for (int i3 = 0; i3 < count; i3++) {
                            iva.a(query.moveToNext());
                            jArr[i3] = query.getLong(0);
                        }
                        iva.a(!query.moveToNext());
                        bundle.putLongArray("seqno", jArr);
                        if (query != null) {
                            query.close();
                        }
                        str = null;
                    }
                } catch (Exception e3) {
                    str = e3.toString();
                } catch (Throwable th4) {
                    apev.a(th2, th4);
                }
            } else {
                str = "Must set both package_name and extended_type_name parameters";
            }
        } else if ("MobStoreCreateSuccessFile".equals(string)) {
            File file = new File(this.a.b.getFilesDir(), "datadownload/shared/public");
            if (!file.mkdirs()) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                sb3.append("Failed to create dir: ");
                sb3.append(valueOf3);
                str = sb3.toString();
            } else {
                File file2 = new File(file, "success.txt");
                oso.a("Writing diagnostic MobStore success file: %s", (Object) file2);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write("success\n".getBytes("UTF-8"));
                    fileOutputStream.close();
                    str = null;
                } catch (IOException e4) {
                    String valueOf4 = String.valueOf(file2);
                    String valueOf5 = String.valueOf(e4);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 27 + String.valueOf(valueOf5).length());
                    sb4.append("Failed to write file: ");
                    sb4.append(valueOf4);
                    sb4.append(" bc: ");
                    sb4.append(valueOf5);
                    str = sb4.toString();
                } catch (Throwable th5) {
                    apev.a(th, th5);
                }
            }
        } else if ("updateNativeConfig".equals(string)) {
            osf osf12 = this.a;
            ppp ppp12 = osf12.c;
            orr orr = new orr(osf12, aonk.UPDATE_NATIVE_CONFIG);
            ppp12.d(orr);
            arrayList.add(orr);
            str = null;
        } else if ("newModuleIntent".equals(string)) {
            Intent intent2 = new Intent(IntentOperation.ACTION_NEW_MODULE);
            intent2.setClassName(this.a.b.getPackageName(), "com.google.android.gms.icing.service.IndexWorkerService");
            this.a.b.startService(intent2);
            str = null;
        } else {
            StringBuilder sb5 = new StringBuilder(string.length() + 20);
            sb5.append("Unknown operation \"");
            sb5.append(string);
            sb5.append("\"");
            str = sb5.toString();
        }
        if (((Bundle) this.n).getBoolean("block")) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object h = ((pqa) arrayList.get(i4)).h();
                if (h != null && !(h instanceof Void)) {
                    if (h instanceof Boolean) {
                        if (!((Boolean) h).booleanValue()) {
                            str = "Operation failed";
                        }
                    } else if (h instanceof String) {
                        str = (String) h;
                    } else {
                        String valueOf6 = String.valueOf(h.getClass());
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 21);
                        sb6.append("Unknown return type: ");
                        sb6.append(valueOf6);
                        str = sb6.toString();
                    }
                }
            }
        }
        bundle.putString("error_message", str);
        BundleResponse bundleResponse = new BundleResponse();
        bundleResponse.a = Status.a;
        bundleResponse.b = bundle;
        return bundleResponse;
        throw th;
        throw th2;
    }

    private final void a(String str, Bundle bundle) {
        PendingCallback pendingCallback = new PendingCallback((IBinder) new aafz());
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", str);
        intent.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent.putExtra("tag", "Diagnostic");
        if (bundle != null) {
            intent.putExtra("extras", bundle);
        }
        intent.putExtra("callback", pendingCallback);
        this.a.b.startService(intent);
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        BundleResponse bundleResponse = new BundleResponse();
        bundleResponse.a = status;
        return bundleResponse;
    }
}
