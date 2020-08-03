package com.aurora.api.upload;

/**
 * 上传文件接口 上传成功返回图片url 失败返回失败信息  可以参考 controller 下test 的那个类 我里面有一个demo 就是上传文件的 十分简单
 * 参考博客地址：https://blog.csdn.net/gnail_oug/article/details/80324120?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.channel_param
 */
public interface uploadApi {

    /**
     * 上传项目的图片
     * @return
     */
    public String uploadProjectImage();

    /**
     * 上传项目的图片
     * @return
     */
    public String uploadProjectVideo();

    /**
     * 上传顾问的图片
     * @return
     */
    public String uploadAdviserImage();

    /**
     *上传视频剧的图片
     * @return
     */
    public String uploadVideodramaImage();

    /**
     * 上传视频剧的视频
     * @return
     */
    public String uploadVideodramaVideo();
}
