package emu.grasscutter.server.http.dispatch;

public class HotUpdateResourceDownload {
  public static class Resource {
    public String resourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/5.0_live";
    
    public String dataUrl = "https://autopatchcn.yuanshen.com/client_design_data/5.0_live";
    
    public String resourceUrlBak = "5.0_live";
    
    public int clientDataVersion = 26487341;
    
    public int clientSilenceDataVersion = 26368837;
    
    public String clientDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"88a0d1f6825ec3b6aaf9ea39a02f78da\", \"hash\": \"a72baf3b5c76f0ac\", \"fileSize\": 68545}\r\n{\"remoteName\": \"data_versions_medium\", \"md5\": \"9429b4e9dd8cbdaf19c41ff05f18b384\", \"hash\": \"a79950c775cf1630\", \"fileSize\": 6662}";
    
    public String clientSilenceDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"8ae3d12ddeffa27349ab306ce05ec0b7\", \"hash\": \"ef8cb53633584c7a\", \"fileSize\": 522}";
    
    public HotUpdateResourceDownload.ResVersionConfig resVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
    
    public String clientVersionSuffix = "57a90bbd52";
    
    public String clientSilenceVersionSuffix = "0af120923b";
    
    public String nextResourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/5.0_live";
    
    public HotUpdateResourceDownload.ResVersionConfig nextResVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
  }
  
  public static class ResVersionConfig {
    public int version = 26458901;
    
    public String md5 = "{\"remoteName\": \"base_revision\", \"md5\": \"149cad27b543e345df504a496949ec7d\", \"fileSize\": 19}";
  
    public String releaseTotalSize = "0";
    
    public String versionSuffix = "befdda25ff";
    
    public String branch = "5.0_live";
  }
}
