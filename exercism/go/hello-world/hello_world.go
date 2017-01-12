package greeting

const testVersion = 3

func HelloWorld(entrada string) string {
	if entrada == "" {
		entrada = "World"
	}
	return "Hello, " + entrada + "!"
}
