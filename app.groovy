@GrabResolver(name='custom', root='http://localhost:8081/artifactory/remote-repos', m2Compatible=true)
@Grab("org.webjars:jquery:2.0.3-1") // this will automatically fetch jquery
@Grab("thymeleaf-spring4")

@Controller
class Application {
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name)
		return "greeting"
	}
}
