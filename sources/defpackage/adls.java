package defpackage;

/* renamed from: adls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adls {
    public static final adro a = new adro("execution.current_execution_id", "");
    public static final adro b = new adro("execution.current_action_name", "");
    public static final adrf c = new adrf("execution.current_action_params");
    public static final adrg d = new adrg("execution.download_retry_count", 0);
    public static final adrg e = new adrg("execution.digest_verification_fail_count", 0);
    @Deprecated
    public static final adrf f = new adrf("execution.package_metadata");
    public static final adrj g = new adrj("execution.package_metadata_proto", adqw.e);
    public static final adrj h = new adrj("execution.ab_payload_spec", adqq.d);
    public static final adra i = new adra("execution.ab_update_started", false);
    public static final adra j = new adra("execution.non_ab_update_scheduled", false);
    public static final adra k = new adra("execution.package_files_created", true);
    public static final adrl l = new adrl("execution.downloads_attempted_at");
    public static final adra m = new adra("execution.switch_slot_on_reboot", true);
}
