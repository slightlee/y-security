
      
   @Api：用在类上，说明该类的作用
    
   @ApiOperation：用在方法上，说明方法的作用，标注在具体请求上，value和notes的作用差不多，都是对请求进行说明；tags则是对请求进行分类的，比如你有好几个controller，分别属于不同的功能模块，那这里我们就可以使用tags来区分了。
    
   @ApiImplicitParams：用在方法上包含一组参数说明
    
   @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面。
    
   @ApiResponses：用于表示一组响应
    
   @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
    
   @ApiModel：描述一个Model的信息（这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）表明这是一个被swagger框架管理的model，用于class上
   @ApiModelProperty： 这里顾名思义，描述一个model的属性，就是标注在被标注了@ApiModel的class的属性上，这里的value是对字段的描述，example是取值例子，注意这里的example很有用，对于前后端开发工程师理解文档起到了关键的作用，因为会在api文档页面上显示出这些取值来；这个注解还有一些字段取值，可以自己研究，举例说一个：position，表明字段在model中的顺序。
  
 

